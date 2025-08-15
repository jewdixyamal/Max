package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.os.Looper;
import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;
import one.me.android.di.ConcurrentComponent;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.mediapicker.MediaPickerScreen;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: j78  reason: default package */
public final /* synthetic */ class j78 implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ j78(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r6v46, types: [java.lang.Object, py7] */
    /* JADX WARNING: type inference failed for: r2v4, types: [a66, ffe] */
    public final Object invoke() {
        int i = 0;
        switch (this.a) {
            case 0:
                return new Path();
            case 1:
                return new byte[131072];
            case 2:
                bc7[] bc7Arr = MediaPickerScreen.B0;
                return wuc.AVATAR_PICKER_GALLERY;
            case 3:
                bc7[] bc7Arr2 = MediaPickerScreen.B0;
                return new s86(new j78(4));
            case 4:
                bc7[] bc7Arr3 = MediaPickerScreen.B0;
                return Boolean.FALSE;
            case 5:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                return paint;
            case 6:
                nz4 nz4 = nz4.a;
                return new qn5(3, new hn8(nz4, nz4));
            case 7:
                float[] fArr = new float[8];
                while (i < 8) {
                    fArr[i] = fk4.d().getDisplayMetrics().density * 16.0f;
                    i++;
                }
                return fArr;
            case 8:
                return new dg3(1);
            case 9:
                return new ix3(fk4.d().getDisplayMetrics().density * 4.0f);
            case 10:
                return new ix3(fk4.d().getDisplayMetrics().density * 76.0f);
            case 11:
                return new ik6();
            case Protos.Attaches.Attach.PRESENT /*12*/:
                bc7[] bc7Arr4 = MessagesSettingsScreen.Y;
                return wuc.SETTINGS_MESSAGES;
            case 13:
                bc7[] bc7Arr5 = MessagesSettingsScreen.Y;
                return new u89((hp) p89.a.getAccessor().c(hp.class));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new sc4(om9.c, 1);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new sc4(om9.c, 2);
            case 16:
                bc7[] bc7Arr6 = NotificationsSettingsScreen.v0;
                return wuc.SETTINGS_NOTIFICATIONS;
            case LangUtils.HASH_SEED /*17*/:
                bc7[] bc7Arr7 = NotificationsSettingsScreen.v0;
                return new gx9();
            case 18:
                bc7[] bc7Arr8 = NotificationsSettingsScreen.v0;
                return new bh0(sw9.a.getAccessor().d(lw9.class), true, (po3) null, 46);
            case 19:
                int i2 = OneMeApplication.s0;
                lqf lqf = (lqf) bcf.a.getAccessor().c(lqf.class);
                lqf.getClass();
                hm9.m("lqf", "registerSelf", new Object[0]);
                lqf.j.a.add(lqf);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    q9b.s0.Y.a(lqf.m);
                } else {
                    new Handler(Looper.getMainLooper()).post(new jqf(lqf, 0));
                }
                return e5f.a;
            case 20:
                int i3 = OneMeApplication.s0;
                ((qyc) o7b.a.getAccessor().c(qyc.class)).h.add((tke) jyc.a.getAccessor().c(tke.class));
                return e5f.a;
            case 21:
                int i4 = OneMeApplication.s0;
                byte[] bArr = b.a;
                s36.d = new Object();
                return e5f.a;
            case 22:
                int i5 = OneMeApplication.s0;
                ((b5) y4.a.getAccessor().d(b5.class).getValue()).b();
                return e5f.a;
            case 23:
                int i6 = OneMeApplication.s0;
                j47.T(j1e.a(((w9a) jyc.a.s()).b().plus(pag.a())), (lx3) null, (vx3) null, new ffe(2, (Continuation) null), 3);
                return e5f.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                int i7 = OneMeApplication.s0;
                ConcurrentComponent.INSTANCE.getExecutors().c().execute(new kc(9));
                return e5f.a;
            case 25:
                int i8 = OneMeApplication.s0;
                x45 x45 = sd3.a;
                j47.t0 = yxc.o;
                j47.u0 = c32.c;
                j47.v0 = nd2.c;
                return e5f.a;
            case 26:
                int i9 = OneMeApplication.s0;
                np npVar = np.a;
                xe6 xe6 = (xe6) ((u8e) bcf.a.getAccessor().c(u8e.class));
                npVar.b("services_name", xe6.f);
                int i10 = xe6.d;
                Context context = xe6.a;
                if (i10 == -1) {
                    xe6.d = ee6.d.b(context, fe6.a);
                }
                npVar.b("services_status", String.valueOf(xe6.d));
                if (xe6.e == -1) {
                    Object obj = ee6.c;
                    int i11 = pe6.e;
                    try {
                        i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    xe6.e = i;
                }
                npVar.b("services_version", String.valueOf(xe6.e));
                return e5f.a;
            case 27:
                int i12 = OneMeApplication.s0;
                uca uca = (uca) y8a.a.getAccessor().c(uca.class);
                uca.d(us7.Y, uca.getClass().getName(), "oneMeLogger init", (Throwable) null);
                return e5f.a;
            case 28:
                int i13 = OneMeApplication.s0;
                return new ly5();
            default:
                int i14 = OneMeApplication.s0;
                return (ee3) y8a.a.getAccessor().c(ee3.class);
        }
    }
}
