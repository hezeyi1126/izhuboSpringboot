package springboot.hello.util;

import java.io.File;
import java.io.IOException;

import net.coobird.thumbnailator.Thumbnails;
/**
使用起来特别的简单：一行代码就搞定了

Thumbnails.of("原图文件的路径") 
        .scale(1f) 
        .outputQuality(0.5f) 
        .toFile("压缩后文件的路径");

其中的scale是可以指定图片的大小，值在0到1之间，1f就是原图大小，0.5就是原图的一半大小，这里的大小是指图片的长宽。

而outputQuality是图片的质量，值也是在0到1，越接近于1质量越好，越接近于0质量越差。

对于压缩图片来说上面就已经足够了。

 

PS：经过使用后的反馈，这个工具无法正确压缩出png格式的图片

因为png本身就是一种无损的图片格式，而jpg是一种压缩的图片格式；
当前方法目的是为了在尽可能不丢失图片质量的情况下进行的压缩；
建议将图片压缩后的格式设置成jpg来解决；.outputFormat("jpg")
工具源码本身最后还是调用jdk中的ImageIO.createImageOutputStream(fos);来实现的；

 

优点
1、简单容易使用。

2、压缩图片效果很好。如下：其中100是原图，50就是0.5f
//**/
public class ImgUtil {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Administrator\\Pictures\\1f3b1e9e-cb45-46c8-bee5-d0fc82b9fbf4.jpg");
		Thumbnails.of(f).size(300,500)
		.outputQuality(0.1f)
		.toFile("C:\\Users\\Administrator\\Pictures\\2f3b1e9e-cb45-46c8-bee5-d0fc82b9fbf4.jpg");
		
	}
	
	/**
	 * 裁剪图片
	 */
	public static  void  cut(String filepath) {
		try {
			Thumbnails.of(filepath).size(300,500)
			.outputQuality(0.1f)
			.toFile(filepath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 裁剪图片
	 */
	public static  void  cut(File filepath) {
		try {
			Thumbnails.of(filepath).size(300,500)
			.outputQuality(0.1f)
			.toFile(filepath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
