
package com.uwetrottmann.tmdb.services;

import com.uwetrottmann.tmdb.BaseTestCase;
import com.uwetrottmann.tmdb.entities.GenreResults;

import java.text.ParseException;

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
