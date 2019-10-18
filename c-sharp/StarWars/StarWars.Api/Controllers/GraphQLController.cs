using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using GraphQL;
using GraphQL.Types;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using StarWars.Api.Models;
using Microsoft.EntityFrameworkCore;
using StarWars.Core.Data;
using StarWars.Core.Models;
using StarWars.Data.EntityFramework;

namespace StarWars.Api.Controllers
{
    [Route("graphql")]
    public class GraphQLController : Controller
    {
        private StarWarsQuery _starWarsQuery { get; set; }
        
        public GraphQLController(StarWarsQuery starWarsQuery)
        {
            _starWarsQuery = starWarsQuery;
        }
        [HttpGet]
        public IActionResult Index()
        {
            return View();
        }   
        [HttpPost]
        public async Task<IActionResult> Post([FromBody] GraphQLQuery query)
        {
            var schema = new Schema {Query = _starWarsQuery};
            var executionOptions = new ExecutionOptions {Schema = schema, Query = query.Query};
            try
            {
                var result = await new DocumentExecuter().ExecuteAsync(executionOptions).ConfigureAwait(false);

                if (result.Errors?.Count > 0)
                {
                    return BadRequest();
                }

                return Ok(result);
            }
            catch (Exception ex)
            {
                return BadRequest(ex);
            }
        }
    }
}