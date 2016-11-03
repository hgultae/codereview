package com.intelematics.interview.net;

import com.intelematics.interview.models.Song;
import com.intelematics.interview.util.Utils;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Hurman on 03/11/2016.
 */
public interface IWebService {


    @GET(Utils.ENDPOINT_SONGS)
    Call<Song> getSongs();

}
