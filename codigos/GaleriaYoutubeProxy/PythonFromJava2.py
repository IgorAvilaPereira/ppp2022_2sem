import sys
from pytube import YouTube, Playlist
yt = YouTube(sys.argv[1])
print(yt.title)
