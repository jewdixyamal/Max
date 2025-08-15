package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import androidx.media3.datasource.DataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: vs3  reason: default package */
public final class vs3 extends ki0 {
    public final ContentResolver X;
    public Uri Y;
    public AssetFileDescriptor Z;
    public FileInputStream s0;
    public long t0;
    public boolean u0;

    public vs3(Context context) {
        super(false);
        this.X = context.getContentResolver();
    }

    public final long G(a34 a34) {
        AssetFileDescriptor assetFileDescriptor;
        a34 a342 = a34;
        int i = 2000;
        try {
            Uri normalizeScheme = a342.a.normalizeScheme();
            this.Y = normalizeScheme;
            d();
            boolean equals = "content".equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.X;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.Z = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.s0 = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                long j = a342.f;
                if (i2 == 0 || j <= length) {
                    long startOffset = assetFileDescriptor.getStartOffset();
                    long j2 = length;
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
                            long j3 = j2 - skip;
                            this.t0 = j3;
                            if (j3 < 0) {
                                throw new DataSourceException((Throwable) null, 2008);
                            }
                        }
                        long j4 = a342.g;
                        int i3 = (j4 > -1 ? 1 : (j4 == -1 ? 0 : -1));
                        if (i3 != 0) {
                            long j5 = this.t0;
                            this.t0 = j5 == -1 ? j4 : Math.min(j5, j4);
                        }
                        this.u0 = true;
                        f(a34);
                        return i3 != 0 ? j4 : this.t0;
                    }
                    throw new DataSourceException((Throwable) null, 2008);
                }
                throw new DataSourceException((Throwable) null, 2008);
            }
            throw new DataSourceException((Throwable) new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
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
        int i3 = oaf.a;
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
