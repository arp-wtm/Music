
# Music Structure for Udacity ABND project 4<br>
This app structure is very simple and is suitable for a music player app.<br>
It contains two activity, referring the two screens:<br>
-MainActivity displays a scrollable list of ten Songs and a play image.Click on a row opens the second screen.<br>
-DetailActivity displays in vertical layout, with properly label: tytle, artist and description of<br>
the song you choose. It has also a button "GOTO YOUTUBE" to call the related video on YouTube.<br>
# Test
The code runs without errors on my phone Android 7.0 Api 24<br>
Each button’s behavior is determined by an OnClickListener in the<br>
Java code rather than by the android:onClick attribute in the XML Layout<br>
Each button properly opens the intended activity using an explicit Intent.<br>
I use the example of Flavour App, seen in the lesson to realize the list with recycled view.<br>
I create a custom adapter SongAdapter to populate the layout with views <br>
based on instances of the custom class Song. It contains 4 states <br>
(IdSong, Song Name, Artist Name, Description)<br>
All information about the objects Song are stored in an ArrayList.<br>
# Licence
Copyright 2017 The Android Open Source Project <br>
 
  Licensed under the Apache License, Version 2.0 (the "License"); <br>
  you may not use this file except in compliance with the License.<br>
  You may obtain a copy of the License at<br>
 <br>
      http://www.apache.org/licenses/LICENSE-2.0 <br>
 <br>
  Unless required by applicable law or agreed to in writing, software<br>
  distributed under the License is distributed on an "AS IS" BASIS,<br>
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<br>
  See the License for the specific language governing permissions and<br>
  limitations under the License.<br>
