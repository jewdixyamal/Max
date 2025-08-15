package defpackage;

import android.os.SystemClock;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: bw4  reason: default package */
public final class bw4 implements qq6, n99 {
    public static final long[] X = new long[0];
    public long a;
    public final Object b;
    public final Object c;
    public final Object o;

    public bw4(ik5 ik5) {
        this.o = ik5;
        this.b = new kw4(0.3d, 0.0d, 6);
        this.c = new l7(1, false);
    }

    public void a(long j) {
        if (this.a != j) {
            this.a = j;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ik5 ik5 = (ik5) this.o;
            ik5.a = elapsedRealtime;
            ((kw4) this.b).a(((l7) this.c).c(j, ik5.a));
        }
    }

    public void b(u99 u99, int i) {
        boolean z = true;
        if (i < 1 || i > 7) {
            z = false;
        }
        c54.j("Invalid metering mode " + i, z);
        if ((i & 1) != 0) {
            ((ArrayList) this.b).add(u99);
        }
        if ((i & 2) != 0) {
            ((ArrayList) this.c).add(u99);
        }
    }

    public void c(int i) {
        if (((InputStream) this.o).read((byte[]) this.b, 0, i) == i) {
            this.a += (long) i;
            return;
        }
        throw new IOException("read failed");
    }

    public long e() {
        return this.a;
    }

    public long getContentLength() {
        return this.a;
    }

    public String getContentType() {
        return (String) this.o;
    }

    public int j() {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        byteBuffer.position(0);
        c(4);
        return byteBuffer.getInt();
    }

    public void k(int i) {
        while (i > 0) {
            int skip = (int) ((InputStream) this.o).skip((long) i);
            if (skip >= 1) {
                i -= skip;
                this.a += (long) skip;
            } else {
                throw new IOException("Skip didn't move at least 1 byte forward");
            }
        }
    }

    public long o() {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        byteBuffer.position(0);
        c(4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public int readUnsignedShort() {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        byteBuffer.position(0);
        c(2);
        return byteBuffer.getShort() & 65535;
    }

    public void writeTo(OutputStream outputStream) {
        Iterator it = ((List) this.c).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = (String) this.b;
            if (hasNext) {
                pq6 pq6 = (pq6) it.next();
                outputStream.write(nq6.b);
                nq6.c(outputStream, str);
                byte[] bArr = nq6.a;
                outputStream.write(bArr);
                nq6.c(outputStream, pq6.b);
                outputStream.write(bArr);
                pq6.a.writeTo(outputStream);
                outputStream.write(bArr);
            } else {
                byte[] bArr2 = nq6.b;
                outputStream.write(bArr2);
                nq6.c(outputStream, str);
                outputStream.write(bArr2);
                return;
            }
        }
    }

    public bw4(r6d r6d, vw vwVar) {
        this.b = r6d;
        this.c = vwVar;
        int f = r6d.f();
        long j = 0;
        if (f <= 64) {
            this.a = f != 64 ? -1 << f : j;
            this.o = X;
            return;
        }
        this.a = 0;
        int i = (f - 1) >>> 6;
        long[] jArr = new long[i];
        if ((f & 63) != 0) {
            jArr[i - 1] = -1 << f;
        }
        this.o = jArr;
    }

    public bw4(String str, List list) {
        long j;
        this.b = str;
        this.c = list;
        this.o = "multipart/form-data; boundary=".concat(str);
        long j2 = -1;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((pq6) it.next()).a.getContentLength() < 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        long length = ((long) nq6.b.length) + ((long) nq6.b((String) this.b)) + ((long) nq6.a.length);
        for (pq6 pq6 : (List) this.c) {
            long length2 = length + ((long) nq6.b.length) + ((long) nq6.b((String) this.b));
            byte[] bArr = nq6.a;
            long length3 = length2 + ((long) bArr.length);
            qq6 qq6 = pq6.a;
            if (qq6.getContentLength() < 0) {
                j = -1;
            } else {
                j = qq6.getContentLength() + ((long) (nq6.b(pq6.b) + bArr.length)) + ((long) bArr.length);
            }
            length = length3 + j;
        }
        j2 = length;
        this.a = j2;
    }

    public bw4(bw4 bw4) {
        this.b = Collections.unmodifiableList((ArrayList) bw4.b);
        this.c = Collections.unmodifiableList((ArrayList) bw4.c);
        this.o = Collections.unmodifiableList((ArrayList) bw4.o);
        this.a = bw4.a;
    }

    public bw4(u99 u99) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.o = new ArrayList();
        this.a = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        b(u99, 1);
    }

    public bw4(FileInputStream fileInputStream) {
        this.a = 0;
        this.o = fileInputStream;
        byte[] bArr = new byte[4];
        this.b = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.c = wrap;
        wrap.order(ByteOrder.BIG_ENDIAN);
    }
}
