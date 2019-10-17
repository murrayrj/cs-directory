using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Logging;
using StarWars.Core.Models;

namespace StarWars.Data.EntityFramework
{
    public class StarWarsContext : DbContext
    {
        private readonly ILogger _logger;

        public StarWarsContext(DbContextOptions options, ILogger<StarWarsContext> logger) : base(options)
        {
            _logger = logger;
            Database.EnsureCreated();
        }

        public DbSet<Droid> Droids { get; set; }
    }
}