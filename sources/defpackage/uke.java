package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.protocol.HTTP;

/* renamed from: uke  reason: default package */
public final class uke implements yp6 {
    public static final AtomicReference x0 = new AtomicReference();
    public z24 X;
    public yic Y;
    public mhc Z;
    public final String a;
    public final HashMap b;
    public final ny0 c;
    public final y0f o;
    public boolean s0;
    public long t0;
    public long u0;
    public long v0;
    public long w0;

    public uke(ny0 ny0, String str, y0f y0f) {
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            this.o = y0f;
            this.b = new HashMap();
            this.c = ny0;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final long L(z24 z24) {
        vq6 vq6;
        z24 z242 = z24;
        this.X = z242;
        long j = 0;
        this.w0 = 0;
        this.v0 = 0;
        long j2 = z242.f;
        long j3 = z242.g;
        boolean z = (z242.i & 1) != 0;
        String uri = z242.a.toString();
        try {
            od3 od3 = new od3();
            od3.j((vq6) null, uri);
            vq6 = od3.b();
        } catch (IllegalArgumentException unused) {
            vq6 = null;
        }
        l84 l84 = new l84();
        l84.a = vq6;
        l84.Q(UUID.randomUUID().toString());
        synchronized (this.b) {
            try {
                for (Map.Entry entry : this.b.entrySet()) {
                    l84.q((String) entry.getKey(), (String) entry.getValue());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        long j4 = -1;
        if (!(j2 == 0 && j3 == -1)) {
            long max = Math.max(0, j2);
            long j5 = j3 != -1 ? (j3 + max) - 1 : max;
            if (max < j5) {
                StringBuilder k = au1.k(max, "bytes=", "-");
                k.append(j5);
                ((bj6) l84.c).a("Range", k.toString());
            }
        }
        ((bj6) l84.c).a(HTTP.USER_AGENT, this.a);
        if (!z) {
            ((bj6) l84.c).a("Accept-Encoding", HTTP.IDENTITY_CODING);
        }
        mhc r = l84.r();
        this.Z = r;
        try {
            yic f = ((u2a) this.c).b(r).f();
            this.Y = f;
            int i = f.o;
            if (f.m()) {
                String str = this.Y.Z.o().a;
                if (!str.isEmpty()) {
                    if (i == 200) {
                        long j6 = z242.f;
                        if (j6 != 0) {
                            j = j6;
                        }
                    }
                    this.t0 = j;
                    if ((z242.i & 1) == 0) {
                        long n = this.Y.Z.n();
                        long j7 = z242.g;
                        if (j7 != -1) {
                            j4 = j7;
                        } else if (n != -1) {
                            j4 = n - this.t0;
                        }
                        this.u0 = j4;
                    } else {
                        this.u0 = z242.g;
                    }
                    this.s0 = true;
                    y0f y0f = this.o;
                    if (y0f != null) {
                        ((h84) y0f).g(z242, true);
                    }
                    return this.u0;
                }
                naf.c(this.Y.Z);
                this.Y = null;
                throw new HttpDataSource$InvalidContentTypeException(str, z242);
            }
            cj6 cj6 = this.Z.d;
            cj6.getClass();
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            int size = cj6.size();
            int i2 = 0;
            while (i2 < size) {
                String b2 = cj6.b(i2);
                Locale locale = Locale.US;
                if (b2 != null) {
                    String lowerCase = b2.toLowerCase(locale);
                    List list = (List) treeMap.get(lowerCase);
                    if (list == null) {
                        list = new ArrayList(2);
                        treeMap.put(lowerCase, list);
                    }
                    list.add(cj6.d(i2));
                    i2++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            naf.c(this.Y.Z);
            this.Y = null;
            int i3 = maf.a;
            throw new HttpDataSource$InvalidResponseCodeException(i, (String) null, (DataSourceException) null, treeMap, z24);
        } catch (IOException e) {
            throw new HttpDataSource$HttpDataSourceException("Unable to connect to " + z242.a.toString(), e, z242, 2000);
        }
    }

    public final void N(y0f y0f) {
    }

    public final Map a() {
        return Collections.emptyMap();
    }

    public final int b(int i, byte[] bArr, int i2) {
        long j = this.u0;
        if (j != -1) {
            i2 = (int) Math.min((long) i2, j - this.w0);
        }
        if (i2 == 0) {
            return -1;
        }
        int read = this.Y.Z.m().read(bArr, i, i2);
        if (read == -1) {
            long j2 = this.u0;
            if (j2 == -1 || j2 == this.w0) {
                return -1;
            }
            throw new EOFException();
        }
        this.w0 += (long) read;
        y0f y0f = this.o;
        if (y0f != null) {
            ((h84) y0f).e(this.X, true, read);
        }
        return read;
    }

    public final void c() {
        if (this.v0 != this.t0) {
            AtomicReference atomicReference = x0;
            byte[] bArr = (byte[]) atomicReference.getAndSet((Object) null);
            if (bArr == null) {
                bArr = new byte[4096];
            }
            while (true) {
                long j = this.v0;
                long j2 = this.t0;
                if (j != j2) {
                    int read = this.Y.Z.m().read(bArr, 0, (int) Math.min(j2 - j, (long) bArr.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.v0 += (long) read;
                        y0f y0f = this.o;
                        if (y0f != null) {
                            ((h84) y0f).e(this.X, true, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    atomicReference.set(bArr);
                    return;
                }
            }
        }
    }

    public final void close() {
        if (this.s0) {
            this.s0 = false;
            y0f y0f = this.o;
            if (y0f != null) {
                ((h84) y0f).f(this.X, true);
            }
            naf.c(this.Y.Z);
            this.Y = null;
        }
    }

    public final Uri getUri() {
        mhc mhc = this.Z;
        if (mhc == null) {
            return null;
        }
        return Uri.parse(mhc.b.i);
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            c();
            return b(i, bArr, i2);
        } catch (IOException e) {
            throw HttpDataSource$HttpDataSourceException.b(e, this.X, 2);
        }
    }
}
