package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.media.MediaDescriptionCompat;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* renamed from: ig8  reason: default package */
public final class ig8 extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public final /* synthetic */ pg8 d;

    public ig8(pg8 pg8) {
        this.d = pg8;
        MediaDescriptionCompat mediaDescriptionCompat = pg8.W0;
        Uri uri = null;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        if (iconBitmap != null && iconBitmap.isRecycled()) {
            iconBitmap = null;
        }
        this.a = iconBitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = pg8.W0;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : uri;
    }

    public final BufferedInputStream a(Uri uri) {
        InputStream inputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            inputStream = this.d.y0.getContentResolver().openInputStream(uri);
        } else {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            openConnection.setConnectTimeout(30000);
            openConnection.setReadTimeout(30000);
            inputStream = openConnection.getInputStream();
        }
        if (inputStream == null) {
            return null;
        }
        return new BufferedInputStream(inputStream);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:19|20|21|22|(2:24|(1:26)(1:65))|27|(1:29)(3:30|31|32)) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        java.util.Objects.toString(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007a, code lost:
        if (r3 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0077 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042 A[Catch:{ IOException -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082 A[SYNTHETIC, Splitter:B:42:0x0082] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doInBackground(java.lang.Object[] r8) {
        /*
            r7 = this;
            java.lang.Void[] r8 = (java.lang.Void[]) r8
            r8 = 0
            r0 = 1
            r1 = 0
            android.graphics.Bitmap r2 = r7.a
            if (r2 == 0) goto L_0x000b
            goto L_0x0087
        L_0x000b:
            android.net.Uri r2 = r7.b
            if (r2 == 0) goto L_0x0086
            java.io.BufferedInputStream r3 = r7.a(r2)     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            if (r3 != 0) goto L_0x0022
            java.util.Objects.toString(r2)     // Catch:{ IOException -> 0x0077 }
            if (r3 == 0) goto L_0x00c9
        L_0x001a:
            r3.close()     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00c9
        L_0x001f:
            r7 = move-exception
            r1 = r3
            goto L_0x0080
        L_0x0022:
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0077 }
            r4.<init>()     // Catch:{ IOException -> 0x0077 }
            r4.inJustDecodeBounds = r0     // Catch:{ IOException -> 0x0077 }
            android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch:{ IOException -> 0x0077 }
            int r5 = r4.outWidth     // Catch:{ IOException -> 0x0077 }
            if (r5 == 0) goto L_0x001a
            int r5 = r4.outHeight     // Catch:{ IOException -> 0x0077 }
            if (r5 != 0) goto L_0x0035
            goto L_0x001a
        L_0x0035:
            r3.reset()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0048
        L_0x0039:
            r3.close()     // Catch:{ IOException -> 0x0077 }
            java.io.BufferedInputStream r3 = r7.a(r2)     // Catch:{ IOException -> 0x0077 }
            if (r3 != 0) goto L_0x0048
            java.util.Objects.toString(r2)     // Catch:{ IOException -> 0x0077 }
            if (r3 == 0) goto L_0x00c9
            goto L_0x001a
        L_0x0048:
            r4.inJustDecodeBounds = r8     // Catch:{ IOException -> 0x0077 }
            pg8 r5 = r7.d     // Catch:{ IOException -> 0x0077 }
            android.content.Context r5 = r5.y0     // Catch:{ IOException -> 0x0077 }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ IOException -> 0x0077 }
            int r6 = defpackage.qtb.mr_cast_meta_art_size     // Catch:{ IOException -> 0x0077 }
            int r5 = r5.getDimensionPixelSize(r6)     // Catch:{ IOException -> 0x0077 }
            int r6 = r4.outHeight     // Catch:{ IOException -> 0x0077 }
            int r6 = r6 / r5
            int r5 = java.lang.Integer.highestOneBit(r6)     // Catch:{ IOException -> 0x0077 }
            int r5 = java.lang.Math.max(r0, r5)     // Catch:{ IOException -> 0x0077 }
            r4.inSampleSize = r5     // Catch:{ IOException -> 0x0077 }
            boolean r5 = r7.isCancelled()     // Catch:{ IOException -> 0x0077 }
            if (r5 == 0) goto L_0x006c
            goto L_0x001a
        L_0x006c:
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch:{ IOException -> 0x0077 }
            r3.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x0087
        L_0x0074:
            r7 = move-exception
            goto L_0x0080
        L_0x0076:
            r3 = r1
        L_0x0077:
            java.util.Objects.toString(r2)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x0086
            r3.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x0086
        L_0x0080:
            if (r1 == 0) goto L_0x0085
            r1.close()     // Catch:{ IOException -> 0x0085 }
        L_0x0085:
            throw r7
        L_0x0086:
            r2 = r1
        L_0x0087:
            if (r2 == 0) goto L_0x0093
            boolean r3 = r2.isRecycled()
            if (r3 == 0) goto L_0x0093
            java.util.Objects.toString(r2)
            goto L_0x00c9
        L_0x0093:
            if (r2 == 0) goto L_0x00c8
            int r1 = r2.getWidth()
            int r3 = r2.getHeight()
            if (r1 >= r3) goto L_0x00c8
            oo0 r1 = new oo0
            r3 = 1
            r1.<init>((android.graphics.Bitmap) r2, (int) r3)
            r1.b = r0
            c8d r0 = r1.g()
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00ba
            goto L_0x00c6
        L_0x00ba:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r8 = r0.get(r8)
            opa r8 = (defpackage.opa) r8
            int r8 = r8.d
        L_0x00c6:
            r7.c = r8
        L_0x00c8:
            r1 = r2
        L_0x00c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig8.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        pg8 pg8 = this.d;
        pg8.X0 = null;
        Bitmap bitmap2 = pg8.Y0;
        Bitmap bitmap3 = this.a;
        boolean equals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.b;
        if (!equals || !Objects.equals(pg8.Z0, uri)) {
            pg8.Y0 = bitmap3;
            pg8.b1 = bitmap;
            pg8.Z0 = uri;
            pg8.c1 = this.c;
            pg8.a1 = true;
            pg8.l();
        }
    }

    public final void onPreExecute() {
        pg8 pg8 = this.d;
        pg8.a1 = false;
        pg8.b1 = null;
        pg8.c1 = 0;
    }
}
