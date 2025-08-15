package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: tt  reason: default package */
public final class tt extends ji0 {
    public final AssetManager X;
    public Uri Y;
    public InputStream Z;
    public long s0;
    public boolean t0;

    public tt(Context context) {
        super(false);
        this.X = context.getAssets();
    }

    public final long L(z24 z24) {
        try {
            Uri uri = z24.a;
            long j = z24.f;
            this.Y = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            d();
            InputStream open = this.X.open(path, 1);
            this.Z = open;
            if (open.skip(j) >= j) {
                long j2 = z24.g;
                if (j2 != -1) {
                    this.s0 = j2;
                } else {
                    long available = (long) this.Z.available();
                    this.s0 = available;
                    if (available == 2147483647L) {
                        this.s0 = -1;
                    }
                }
                this.t0 = true;
                f(z24);
                return this.s0;
            }
            throw new DataSourceException((Throwable) null, 2008);
        } catch (AssetDataSource$AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new DataSourceException((Throwable) e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    public final void close() {
        this.Y = null;
        try {
            InputStream inputStream = this.Z;
            if (inputStream != null) {
                inputStream.close();
            }
            this.Z = null;
            if (this.t0) {
                this.t0 = false;
                c();
            }
        } catch (IOException e) {
            throw new DataSourceException((Throwable) e, 2000);
        } catch (Throwable th) {
            this.Z = null;
            if (this.t0) {
                this.t0 = false;
                c();
            }
            throw th;
        }
    }

    public final Uri getUri() {
        return this.Y;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.s0;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new DataSourceException((Throwable) e, 2000);
            }
        }
        InputStream inputStream = this.Z;
        int i3 = maf.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.s0;
        if (j2 != -1) {
            this.s0 = j2 - ((long) read);
        }
        b(read);
        return read;
    }
}
