using System;
using System.Collections.Generic;

namespace ListExample
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> wordsList;
            wordsList = new List<string>();
            wordsList.Add("ant");
            wordsList.Add("cat");
            wordsList.Add("rat");

            foreach (var s in wordsList)
            {
                Console.WriteLine(s);
            }
        }
    }
}