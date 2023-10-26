public class AudioPlayer implements MediaPlayer{
    private String mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        } else if (audioType.equals("mp4")){
        System.out.println("Playing MP4 file: " + fileName);
        } else if (audioType.equals("vlc")) {
            System.out.println("Playing vlc file: " + fileName);
        }else System.out.println("Invalid media. avi format not supported");
    }
}
