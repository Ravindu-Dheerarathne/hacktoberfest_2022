from pytube import YouTube
link = input("enter the url for the YouTube video \n")
yt = YouTube(link)

save_path = "C:\\Users\\hp\\Music\\mp4_music"
yt.streams.filter(progressive=True, file_extension='mp4').order_by('resolution')[-1].download(save_path)

# import os
# import sys
# from pytube import YouTube
# from pytube.cli import on_progress

# PATH_SAVE = "C:\\Users\\hp\\Music\\mp4_music"
# link = input("enter the yt link \n")
# yt = YouTube(link, on_progress_callback=on_progress)
# # #Download mp3
# # audio_file = yt.streams.filter(only_audio=True).first().download(PATH_SAVE)
# # base, ext = os.path.splitext(audio_file)
# # new_file = base + '.mp3'
# # os.rename(audio_file, new_file)

# #Download Video
# ys = yt.streams.filter(res="1080p").first()
# ys.download(PATH_SAVE)