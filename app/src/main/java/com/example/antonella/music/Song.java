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

import java.io.Serializable;

/**
 * {@link Song} represents a single musical object.
 * It has 5 properties: id song (that is the code of song's youtube video)
 * song name, artist name, image resource ID and description.
 */
public class Song implements Serializable {
    private String idSong;
    private String songName;
    private String artist;
    private int imageResourceId;
    private String description;

    /*
     * Create a new Song object.
     * @param idSong is the YuoTube code of the official video of the Song
     * @param vSongName is the tytle of the Song
     * @param vArtist is the corresponding name of artist singing it
     * @param image is drawable reference ID that corresponds to the play
     * */

    Song(String vIdSong, String vSongName, String vArtist, int vImageResourceId, String vDescription) {
        idSong = vIdSong;
        songName = vSongName;
        artist = vArtist;
        imageResourceId = vImageResourceId;
        description = vDescription;

    }

    /**
     * Get the tytle of the Song
     */
    public String getSongName() {
        return songName;
    }

    /**
     * Get the name of the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * Get the IDSong
     */

    public String getIdSong() {
        return idSong;
    }

    /**
     * Get the description of the Song
     */

    public String getDescription() {
        return description;
    }
}
