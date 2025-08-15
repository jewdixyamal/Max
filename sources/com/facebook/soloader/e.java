package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;

public abstract class e implements Closeable {
    public static void a(rh5 rh5, byte[] bArr, File file) {
        RandomAccessFile randomAccessFile;
        int read;
        InputStream inputStream = (InputStream) rh5.c;
        dle dle = (dle) rh5.b;
        Object obj = dle.b;
        File file2 = new File(file, (String) dle.b);
        try {
            randomAccessFile = new RandomAccessFile(file2, "rw");
            int available = inputStream.available();
            if (available > 1) {
                SysUtil$LollipopSysdeps.fallocateIfSupported(randomAccessFile.getFD(), (long) available);
            }
            int i = 0;
            while (i < Integer.MAX_VALUE && (read = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i))) != -1) {
                randomAccessFile.write(bArr, 0, read);
                i += read;
            }
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            if (file2.setExecutable(true, false)) {
                randomAccessFile.close();
                if (file2.exists() && !file2.setWritable(false)) {
                    file2.toString();
                    Objects.toString(file);
                    file.canWrite();
                    return;
                }
                return;
            }
            throw new IOException("cannot make file executable: " + file2);
        } catch (IOException e) {
            try {
                file2.toString();
                e.toString();
                mhe.b(file2);
                throw e;
            } catch (Throwable th) {
                if (file2.exists() && !file2.setWritable(false)) {
                    file2.toString();
                    Objects.toString(file);
                    file.canWrite();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public void close() {
    }

    public abstract dle[] m();

    public abstract void n(File file);
}
