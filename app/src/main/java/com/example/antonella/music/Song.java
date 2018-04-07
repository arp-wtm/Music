/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.antonella.music;

/**
 * {@link Song} represents a single musical object.
 * It has 3 properties: song name, artist name, and image resource ID.
 */
public class Song {

    private String mSongName;

    private String mArtist;

    private int mImageResourceId;
    private int mIdSong;

    /*
     * Create a new Song object.
     *
     * @param vSongName is the tytle of the Song
     * @param vArtist is the corresponding name of artist singing it
     * @param image is drawable reference ID that corresponds to the play
     * */

    Song(int vIdSong, String vSongName, String vArtist, int imageResourceId) {
        mSongName = vSongName;
        mArtist = vArtist;
        mImageResourceId = imageResourceId;
        mIdSong= vIdSong;

    }

    /**
     * Get the tytle of the Song
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the name of the artist
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


    public int getIdSong() {
        return mIdSong;
    }
}
