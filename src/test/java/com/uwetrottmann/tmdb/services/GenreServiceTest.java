
package com.uwetrottmann.tmdb.services;

import com.uwetrottmann.tmdb.BaseTestCase;
import com.uwetrottmann.tmdb.entities.AppendToResponse;
import com.uwetrottmann.tmdb.entities.GenreResults;
import com.uwetrottmann.tmdb.entities.Person;
import com.uwetrottmann.tmdb.entities.PersonCredits;
import com.uwetrottmann.tmdb.enumerations.AppendToResponseItem;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.fest.assertions.api.Assertions.assertThat;

public class GenreServiceTest extends BaseTestCase {

    public void test_list() throws ParseException {
        GenreResults results = getManager().genreService().list();
        assertThat(results).isNotNull();
        assertThat(results.genres).isNotNull();
        assertThat(results.genres).isNotEmpty();
        assertThat(results.genres.get(0)).isNotNull();
    }

}
