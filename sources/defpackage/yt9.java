package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: yt9  reason: default package */
public final class yt9 extends pu9 {
    public IconCompat e;
    public IconCompat f;
    public boolean g;

    public final void b(m5d m5d) {
        Bitmap bitmap;
        m5d m5d2 = m5d;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) m5d2.c).setBigContentTitle((CharSequence) this.c);
        IconCompat iconCompat = this.e;
        Context context = (Context) m5d2.b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                xt9.a(bigContentTitle, cs6.d(iconCompat, context));
            } else {
                int i = iconCompat.a;
                if (i == -1) {
                    i = es6.c(iconCompat.b);
                }
                if (i == 1) {
                    IconCompat iconCompat2 = this.e;
                    int i2 = iconCompat2.a;
                    if (i2 == -1) {
                        Object obj = iconCompat2.b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i2 == 1) {
                        bitmap = (Bitmap) iconCompat2.b;
                    } else if (i2 == 5) {
                        Bitmap bitmap2 = (Bitmap) iconCompat2.b;
                        int min = (int) (((float) Math.min(bitmap2.getWidth(), bitmap2.getHeight())) * 0.6666667f);
                        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        float f2 = (float) min;
                        float f3 = 0.5f * f2;
                        float f4 = 0.9166667f * f3;
                        float f5 = 0.010416667f * f2;
                        paint.setColor(0);
                        paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
                        canvas.drawCircle(f3, f3, f4, paint);
                        paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f3, f3, f4, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate(((float) (-(bitmap2.getWidth() - min))) / 2.0f, ((float) (-(bitmap2.getHeight() - min))) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f3, f3, f4, paint);
                        canvas.setBitmap((Bitmap) null);
                        bitmap = createBitmap;
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.g) {
            IconCompat iconCompat3 = this.f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                wt9.a(bigContentTitle, cs6.d(iconCompat3, context));
            }
        }
        if (this.a) {
            bigContentTitle.setSummaryText((CharSequence) this.d);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            xt9.c(bigContentTitle, false);
            xt9.b(bigContentTitle, (CharSequence) null);
        }
    }

    public final String e() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
