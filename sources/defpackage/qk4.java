package defpackage;

import android.os.StrictMode;
import com.facebook.soloader.SoLoader;
import com.facebook.soloader.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: qk4  reason: default package */
public class qk4 extends nud {
    public final File a;
    public final int b;
    public final List c = Arrays.asList(new String[0]);

    public qk4(File file, int i) {
        this.a = file;
        this.b = i;
    }

    public String b() {
        return "DirectorySoSource";
    }

    /* JADX WARNING: type inference failed for: r8v7, types: [fw4, gw4, java.lang.Object] */
    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        if (SoLoader.b != null) {
            boolean contains = this.c.contains(str);
            File file = this.a;
            if (contains) {
                file.getCanonicalPath();
                return 0;
            }
            File file2 = new File(file, str);
            if (!file2.exists()) {
                file2 = null;
            }
            if (file2 == null) {
                file.getCanonicalPath();
                return 0;
            }
            String canonicalPath = file2.getCanonicalPath();
            int i2 = i & 1;
            int i3 = this.b;
            if (i2 != 0 && (i3 & 2) != 0) {
                return 2;
            }
            if ((i3 & 1) != 0) {
                ? obj = new Object();
                obj.a = file2;
                FileInputStream fileInputStream = new FileInputStream(obj.a);
                obj.b = fileInputStream;
                obj.c = fileInputStream.getChannel();
                try {
                    String[] a2 = d.a(str, obj);
                    Arrays.toString(a2);
                    for (String str2 : a2) {
                        if (!str2.startsWith("/")) {
                            SoLoader.i(str2, (String) null, i | 1, threadPolicy);
                        }
                    }
                    obj.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            try {
                SoLoader.b.l(i, canonicalPath);
                return 1;
            } catch (UnsatisfiedLinkError e) {
                throw hm9.i(str, e);
            }
        } else {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        throw th;
    }

    public final String toString() {
        String str;
        File file = this.a;
        try {
            str = String.valueOf(file.getCanonicalPath());
        } catch (IOException unused) {
            str = file.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        return au1.h(sb, this.b, ']');
    }
}
