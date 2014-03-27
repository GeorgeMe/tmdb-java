
package com.uwetrottmann.tmdb.services;

import com.uwetrottmann.tmdb.BaseTestCase;
import com.uwetrottmann.tmdb.entities.Movie;
import com.uwetrottmann.tmdb.entities.Person;
import com.uwetrottmann.tmdb.entities.ResultsPage;

import java.text.ParseException;

public class SearchServiceTest extends BaseTestCase {

    public void test_movieSearch() throws ParseException {
        ResultsPage<Movie> movieResults = getManager().searchService().movie("Fight Club");
        assertNotNull("Result was null.", movieResults);
        assertNotNull("Returned movie list was null.", movieResults.results);
        assertNotNull("Returned page number was null.", movieResults.page);
        assertNotNull("Total pages number was null.", movieResults.total_pages);
        assertNotNull("Total results number was null.", movieResults.total_results);
    }

    public void test_movieSearchWithNullParams() throws ParseException {
        ResultsPage<Movie> movieResults = getManager().searchService().movie("Fight Club", null,
                null, null, null, null, null);
        assertNotNull("Result was null.", movieResults);
        assertNotNull("Returned movie list was null.", movieResults.results);
        assertNotNull("Returned page number was null.", movieResults.page);
        assertNotNull("Total pages number was null.", movieResults.total_pages);
        assertNotNull("Total results number was null.", movieResults.total_results);
    }

    public void test_personSearch() throws ParseException {
        ResultsPage<Movie> results = getManager().searchService().movie("Brad Pitt");
        assertNotNull("Result was null.", results);
        assertNotNull("Returned person list was null.", results.results);
        assertNotNull("Returned page number was null.", results.page);
        assertNotNull("Total pages number was null.", results.total_pages);
        assertNotNull("Total results number was null.", results.total_results);
    }

    public void test_personSearchWithNullParams() throws ParseException {
        ResultsPage<Person> results = getManager().searchService().person("Brad Pitt", null, null,
                null);
        assertNotNull("Result was null.", results);
        assertNotNull("Returned person list was null.", results.results);
        assertNotNull("Returned page number was null.", results.page);
        assertNotNull("Total pages number was null.", results.total_pages);
        assertNotNull("Total results number was null.", results.total_results);
    }

}
