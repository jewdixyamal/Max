package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: us3  reason: default package */
public final class us3 extends ji0 {
    public final ContentResolver X;
    public Uri Y;
    public AssetFileDescriptor Z;
    public FileInputStream s0;
    public long t0;
    public boolean u0;

    public us3(Context context) {
        super(false);
        this.X = context.getContentResolver();
    }

    public final long L(z24 z24) {
        AssetFileDescriptor assetFileDescriptor;
        z24 z242 = z24;
        int i = 2000;
        try {
            Uri uri = z242.a;
            this.Y = uri;
            d();
            boolean equals = "content".equals(z242.a.getScheme());
            ContentResolver contentResolver = this.X;
            if (equals) {
                Bundle bundle = new Bundle();
                if (maf.a >= 31) {
                    ts3.a(bundle);
                }
                assetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.Z = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.s0 = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                long j = z242.f;
                if (i2 == 0 || j <= length) {
                    long startOffset = assetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j) - startOffset;
                    if (skip == j) {
                        if (i2 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.t0 = -1;
                            } else {
                                long position = size - channel.position();
                                this.t0 = position;
                                if (position < 0) {
                                    throw new DataSourceException((Throwable) null, 2008);
                                }
                            }
                        } else {
                            long j2 = length - skip;
                            this.t0 = j2;
                            if (j2 < 0) {
                                throw new DataSourceException((Throwable) null, 2008);
                            }
                        }
                        long j3 = z242.g;
                        int i3 = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
                        if (i3 != 0) {
                            long j4 = this.t0;
                            this.t0 = j4 == -1 ? j3 : Math.min(j4, j3);
                        }
                        this.u0 = true;
                        f(z24);
                        return i3 != 0 ? j3 : this.t0;
                    }
                    throw new DataSourceException((Throwable) null, 2008);
                }
                throw new DataSourceException((Throwable) null, 2008);
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(valueOf.length() + 36);
            sb.append("Could not open file descriptor for: ");
            sb.append(valueOf);
            throw new DataSourceException((Throwable) new IOException(sb.toString()), 2000);
        } catch (ContentDataSource$ContentDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new DataSourceException((Throwable) e2, i);
        }
    }

    public final void close() {
        this.Y = null;
        try {
            FileInputStream fileInputStream = this.s0;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.s0 = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.Z;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.Z = null;
                if (this.u0) {
                    this.u0 = false;
                    c();
                }
            } catch (IOException e) {
                throw new DataSourceException((Throwable) e, 2000);
            } catch (Throwable th) {
                this.Z = null;
                if (this.u0) {
                    this.u0 = false;
                    c();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new DataSourceException((Throwable) e2, 2000);
        } catch (Throwable th2) {
            this.s0 = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.Z;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.Z = null;
                if (this.u0) {
                    this.u0 = false;
                    c();
                }
                throw th2;
            } catch (IOException e3) {
                throw new DataSourceException((Throwable) e3, 2000);
            } catch (Throwable th3) {
                this.Z = null;
                if (this.u0) {
                    this.u0 = false;
                    c();
                }
                throw th3;
            }
        }
    }

    public final Uri getUri() {
        return this.Y;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.t0;
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
        FileInputStream fileInputStream = this.s0;
        int i3 = maf.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.t0;
        if (j2 != -1) {
            this.t0 = j2 - ((long) read);
        }
        b(read);
        return read;
    }
}
