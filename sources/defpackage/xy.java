package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: xy  reason: default package */
public final class xy extends OutputStream {
    public final /* synthetic */ int a;
    public final FileOutputStream b;
    public boolean c;

    public xy(File file, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = false;
                this.b = new FileOutputStream(file);
                return;
            default:
                this.c = false;
                this.b = new FileOutputStream(file);
                return;
        }
    }

    public final void close() {
        switch (this.a) {
            case 0:
                FileOutputStream fileOutputStream = this.b;
                if (!this.c) {
                    this.c = true;
                    flush();
                    try {
                        fileOutputStream.getFD().sync();
                    } catch (IOException e) {
                        fm9.c("Failed to sync file descriptor:", e);
                    }
                    fileOutputStream.close();
                    return;
                }
                return;
            default:
                FileOutputStream fileOutputStream2 = this.b;
                if (!this.c) {
                    this.c = true;
                    flush();
                    try {
                        fileOutputStream2.getFD().sync();
                    } catch (IOException e2) {
                        z04.d0("Failed to sync file descriptor:", e2);
                    }
                    fileOutputStream2.close();
                    return;
                }
                return;
        }
    }

    public final void flush() {
        switch (this.a) {
            case 0:
                this.b.flush();
                return;
            default:
                this.b.flush();
                return;
        }
    }

    public final void write(int i) {
        switch (this.a) {
            case 0:
                this.b.write(i);
                return;
            default:
                this.b.write(i);
                return;
        }
    }

    public final void write(byte[] bArr) {
        switch (this.a) {
            case 0:
                this.b.write(bArr);
                return;
            default:
                this.b.write(bArr);
                return;
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                this.b.write(bArr, i, i2);
                return;
            default:
                this.b.write(bArr, i, i2);
                return;
        }
    }
}
