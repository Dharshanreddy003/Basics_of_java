import java.util.*;
interface MediaPlayer
{
	void play();
	void pause();
	void stop();
}
class AudioPlayer implements MediaPlayer
{
	public void play()
	{
		System.out.println("Your Audio is Played");
	}
	public void pause()
	{
		System.out.println("Your Audio is Paused");
	}
	public void stop()
	{
		System.out.println("Your Audio is Stopped");
	}
}
class VedioPlayer implements MediaPlayer
{
	public void play()
	{
		System.out.println("Your Vedio is Played");
	}
	public void pause()
	{
		System.out.println("Your Vedio is Paused");
	}
	public void stop()
	{
		System.out.println("Your Vedio is Stopped");
	}
}
class StreamingPlayer implements MediaPlayer
{
	public void play()
	{
		System.out.println("Your online Streaming is Played");
	}
	public void pause()
	{
		System.out.println("Your online Streaming is Paused");
	}
	public void stop()
	{
		System.out.println("Your online Streaming is Stopped");
	}
}
public class Multi_Device_MediaPlayer
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("1 for Audio Player \n2 for Vedio Player \n3 for online Streaming");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			loop(1);
			break;
		case 2:
			loop(2);
			break;
		case 3:
			loop(3);
			break;
		default:
			System.out.println("InValid Input");
		}
	}
	public static void loop(int a)
	{
		MediaPlayer o;
		if(a==1)
		{
			o=new AudioPlayer();
		}
		else if(a==2)
		{
			o=new VedioPlayer();
		}
		else
		{
			o=new StreamingPlayer();
		}
		System.out.println("1 for Play \n2 for Pause \n3 for Stop");
		while(true)
		{
			int b=sc.nextInt();

			switch(b)
			{
			case 1:
				o.play();
				break;
			case 2:
				o.pause();
				break;
			case 3:
				o.stop();
				System.exit(0);
			default:
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
	}
}