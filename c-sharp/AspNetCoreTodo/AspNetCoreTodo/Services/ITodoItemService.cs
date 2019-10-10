using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using AspNetCoreTodo.Models;

namespace AspNetCoreTodo.Services
{
    public abstract class ITodoItemService
    {
        public abstract Task<TodoItem[]> GetIncompleteItemsAsync();
    }
}