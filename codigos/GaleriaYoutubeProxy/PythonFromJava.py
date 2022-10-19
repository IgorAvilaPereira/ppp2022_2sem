import sys
from pytube import YouTube, Playlist
yt = YouTube(sys.argv[1])
video = yt.streams.get_highest_resolution()
video.download(output_path='video')
print(yt.title)
