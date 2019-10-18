using AutoMapper;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.HttpsPolicy;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;
using Microsoft.Extensions.Logging;
using StarWars.Api.Controllers;
using StarWars.Api.Models;
using StarWars.Core.Data;
using StarWars.Data.EntityFramework;
using StarWars.Data.EntityFramework.Repositories;
using StarWars.Data.EntityFramework.Seed;

namespace StarWars.Api
{
    public class Startup
    {
        public Startup(IConfiguration configuration)
        {
            Configuration = configuration;
        }

        public IConfiguration Configuration { get; }

        // This method gets called by the runtime. Use this method to add services to the container.
        public void ConfigureServices(IServiceCollection services)
        {
            services.AddMvc();

            services.AddTransient<StarWarsQuery>();
            services.AddTransient<IDroidRepository, DroidRepository>();
            services.AddDbContext<StarWarsContext>(options => 
                options.UseSqlServer(Configuration["ConnectionStrings:StarWarsDatabaseConnection"])
            );
            services.AddMvc(option => option.EnableEndpointRouting = false);
            services.AddLogging(loggingBuilder =>
            {
                loggingBuilder.AddConfiguration(Configuration.GetSection("Logging"));
                loggingBuilder.AddDebug();
            });
        }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IHostEnvironment env, ILoggerFactory loggerFactory, StarWarsContext db)
        {
            app.UseStaticFiles();
            app.UseMvc();

            db.EnsureSeedData();
            
            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
            }

            app.UseHttpsRedirection();

            app.UseRouting();

            app.UseAuthorization();

            app.UseEndpoints(endpoints => { endpoints.MapControllers(); });
        }
    }
}