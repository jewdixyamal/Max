package defpackage;

import android.net.Uri;
import java.io.File;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* renamed from: oj5  reason: default package */
public final /* synthetic */ class oj5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj5 b;

    public /* synthetic */ oj5(yj5 yj5, int i) {
        this.a = i;
        this.b = yj5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                yj5 yj5 = this.b;
                URI uri = yj5.h;
                String str = yj5.a == 1 ? "application/octet-stream" : "application/x-binary; charset=x-user-defined";
                StringBuilder sb = new StringBuilder("POST ");
                sb.append(uri.getRawPath());
                sb.append('?');
                sb.append(uri.getRawQuery());
                sb.append(" HTTP/1.1\nHost: ");
                sb.append(uri.getHost());
                sb.append("\nContent-Type: ");
                sb.append(str);
                sb.append(10);
                File file = yj5.i;
                String str2 = yj5.b;
                String name = yj5.a == 5 ? (str2 == null || str2.length() == 0) ? file.getName() : Uri.encode(str2) : (str2 == null || str2.length() == 0) ? String.valueOf(file.getName().hashCode()) : Uri.encode(str2);
                sb.append("Content-Disposition: attachment; filename=" + name + "\n");
                sb.append("X-Uploading-Mode: parallel\nConnection: keep-alive\nUser-Agent: ");
                String m = rh4.m(sb, (String) yj5.c.e.getValue(), 10);
                if (yj5.u) {
                    String str3 = yj5.d;
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        ir6.d(us7.X, str3, "Prepared sharedHeaders: ".concat(m), (Throwable) null);
                    }
                }
                byte[] bytes = m.getBytes(a52.a);
                ByteBuffer put = ((ct0) yj5.g.getValue()).a(bytes.length).put(bytes);
                put.flip();
                return put;
            default:
                yj5 yj52 = this.b;
                return AsynchronousFileChannel.open(Paths.get(yj52.i.getPath(), new String[0]), Collections.singleton(StandardOpenOption.READ), (ExecutorService) yj52.e.getValue(), new FileAttribute[0]);
        }
    }
}
