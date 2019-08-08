package review;

import java.io.*;

public class copy {
	public static void copy(InputStream input, OutputStream output)
			throws IOException {
		byte[] buf = new byte[4096];
		int bytesRead = 0;
		while ((bytesRead = input.read(buf)) != -1) {
			output.write(buf, 0, bytesRead);
		}
	}

}
