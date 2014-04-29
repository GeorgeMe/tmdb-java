Change Log
==========
Supported API calls
-------------------

 * Configuration service
 * Movie service (incomplete)
 * Person service (incomplete)
 * Search service (incomplete)

0.5.0 *(2014-03-17)*
--------------------
 * Support `/person/{id}`, `/person/{id}/movie_credits`, `/person/{id}/tv_credits` and `/person/{id}/combined_credits`. Thanks @chrisbanes!

0.4.1 *(2014-03-15)*
--------------------
 * First Maven Central release! See the [README][4] for details.
 * Limited fest dependency to test scope.

0.4.0 *(2014-03-09)*
--------------------
 * Use secure TMDb endpoint (https://api.themoviedb.org/3). If you use tmdb-java on Android with okhttp, you should update okhttp to at least 1.5.0 to avoid SSL context issues.

0.3.0 *(2014-02-13)*
--------------------
 * Allow `append_to_response` of supported movie endpoints to `MoviesService.summary()`. Thanks @chrisbanes!
 * Add `MoviesService.releases()`. Thanks @chrisbanes!
 * Add `secure_base_url` and `change_keys` to `Configuration`.
 * Use [retrofit][3] 1.4.1.

0.2.0 *(2013-11-17)*
--------------------
 * Port to [retrofit][1].
 * No longer packaged with dependencies, add them yourself as you see fit (see http://uwetrottmann.github.io/tmdb-java/).
 * Releases published [on GitHub][2].

0.1
---
 * Do not crash on empty (e.g. "") release dates of movies.
 * Switch to a maven powered build.
 * New `myjson` branch which uses a custom gson library to work around https://sites.google.com/site/gson/gson-on-android.


  [1]: https://github.com/square/retrofit
  [2]: https://github.com/UweTrottmann/tmdb-java/releases
  [3]: https://github.com/square/retrofit/blob/master/CHANGELOG.md
  [4]: https://github.com/UweTrottmann/tmdb-java/blob/master/README.md
