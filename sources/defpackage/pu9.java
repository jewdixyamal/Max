package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.text.NumberFormat;

/* renamed from: pu9  reason: default package */
public abstract class pu9 {
    public boolean a = false;
    public Object b;
    public Object c;
    public Object d;

    public pu9(FrameLayout frameLayout, l8b l8b) {
        this.c = frameLayout;
        this.d = l8b;
    }

    public void a(Bundle bundle) {
        if (this.a) {
            bundle.putCharSequence("android.summaryText", (CharSequence) this.d);
        }
        CharSequence charSequence = (CharSequence) this.c;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String e = e();
        if (e != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", e);
        }
    }

    public abstract void b(m5d m5d);

    public RemoteViews c(int i) {
        boolean z;
        boolean z2;
        Resources resources = ((bu9) this.b).a.getResources();
        RemoteViews remoteViews = new RemoteViews(((bu9) this.b).a.getPackageName(), i);
        bu9 bu9 = (bu9) this.b;
        int i2 = bu9.k;
        int i3 = 0;
        if (bu9.i != null) {
            remoteViews.setViewVisibility(twb.icon, 0);
            remoteViews.setImageViewBitmap(twb.icon, d(((bu9) this.b).i, 0, 0));
        }
        CharSequence charSequence = ((bu9) this.b).e;
        if (charSequence != null) {
            remoteViews.setTextViewText(twb.title, charSequence);
        }
        CharSequence charSequence2 = ((bu9) this.b).f;
        boolean z3 = true;
        if (charSequence2 != null) {
            remoteViews.setTextViewText(twb.text, charSequence2);
            z = true;
        } else {
            z = false;
        }
        ((bu9) this.b).getClass();
        if (((bu9) this.b).j > 0) {
            if (((bu9) this.b).j > resources.getInteger(hyb.status_bar_notification_info_maxnum)) {
                remoteViews.setTextViewText(twb.info, resources.getString(r0c.status_bar_notification_info_overflow));
            } else {
                remoteViews.setTextViewText(twb.info, NumberFormat.getIntegerInstance().format((long) ((bu9) this.b).j));
            }
            remoteViews.setViewVisibility(twb.info, 0);
            z = true;
            z2 = true;
        } else {
            remoteViews.setViewVisibility(twb.info, 8);
            z2 = false;
        }
        ((bu9) this.b).getClass();
        bu9 bu92 = (bu9) this.b;
        long j = 0;
        if ((bu92.l ? bu92.F.when : 0) == 0) {
            z3 = z2;
        } else if (bu92.m) {
            remoteViews.setViewVisibility(twb.chronometer, 0);
            int i4 = twb.chronometer;
            bu9 bu93 = (bu9) this.b;
            if (bu93.l) {
                j = bu93.F.when;
            }
            remoteViews.setLong(i4, "setBase", (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + j);
            remoteViews.setBoolean(twb.chronometer, "setStarted", true);
            ((bu9) this.b).getClass();
        } else {
            remoteViews.setViewVisibility(twb.time, 0);
            int i5 = twb.time;
            bu9 bu94 = (bu9) this.b;
            if (bu94.l) {
                j = bu94.F.when;
            }
            remoteViews.setLong(i5, "setTime", j);
        }
        remoteViews.setViewVisibility(twb.right_side, z3 ? 0 : 8);
        int i6 = twb.line3;
        if (!z) {
            i3 = 8;
        }
        remoteViews.setViewVisibility(i6, i3);
        return remoteViews;
    }

    public Bitmap d(IconCompat iconCompat, int i, int i2) {
        Object obj;
        Resources resources;
        Context context = ((bu9) this.b).a;
        if (iconCompat.a == 2 && (obj = iconCompat.b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4)) {
                    String f = iconCompat.f();
                    if ("android".equals(f)) {
                        resources = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(f, 8192);
                            if (applicationInfo != null) {
                                resources = packageManager.getResourcesForApplication(applicationInfo);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        resources = null;
                    }
                    int identifier = resources.getIdentifier(str4, str3, str5);
                    if (iconCompat.e != identifier) {
                        iconCompat.e = identifier;
                    }
                }
            }
        }
        Drawable c2 = cs6.c(cs6.d(iconCompat, context), context);
        int intrinsicWidth = i2 == 0 ? c2.getIntrinsicWidth() : i2;
        if (i2 == 0) {
            i2 = c2.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
        c2.setBounds(0, 0, intrinsicWidth, i2);
        if (i != 0) {
            c2.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        c2.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public String e() {
        return null;
    }

    public abstract View f();

    public abstract Bitmap g();

    public RemoteViews h() {
        return null;
    }

    public RemoteViews i() {
        return null;
    }

    public abstract void j();

    public abstract void k();

    public abstract void l(see see, u00 u00);

    public void m() {
        View f = f();
        if (f != null && this.a) {
            FrameLayout frameLayout = (FrameLayout) this.c;
            Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
            int layoutDirection = frameLayout.getLayoutDirection();
            l8b l8b = (l8b) this.d;
            l8b.getClass();
            if (size.getHeight() == 0 || size.getWidth() == 0) {
                size.toString();
            } else if (l8b.f()) {
                if (f instanceof TextureView) {
                    ((TextureView) f).setTransform(l8b.d());
                } else {
                    Display display = f.getDisplay();
                    if (!l8b.g || display == null || display.getRotation() == l8b.e) {
                    }
                    boolean z = l8b.g;
                    if (!z) {
                        if ((!z ? l8b.c : -kp.C(l8b.e)) != 0) {
                        }
                    }
                }
                RectF e = l8b.e(size, layoutDirection);
                f.setPivotX(0.0f);
                f.setPivotY(0.0f);
                f.setScaleX(e.width() / ((float) l8b.a.getWidth()));
                f.setScaleY(e.height() / ((float) l8b.a.getHeight()));
                f.setTranslationX(e.left - ((float) f.getLeft()));
                f.setTranslationY(e.top - ((float) f.getTop()));
            }
        }
    }

    public void n(bu9 bu9) {
        if (((bu9) this.b) != bu9) {
            this.b = bu9;
            if (bu9 != null) {
                bu9.q(this);
            }
        }
    }

    public abstract bm7 o();

    public pu9() {
    }
}
