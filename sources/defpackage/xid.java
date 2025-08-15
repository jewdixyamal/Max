package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.strictmode.CustomViolation;
import android.os.strictmode.DiskReadViolation;
import android.os.strictmode.UntaggedSocketViolation;
import android.view.VelocityTracker;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.settings.privacy.ui.pincode.SetupPinCodeScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.startconversation.StartConversationScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: xid  reason: default package */
public final /* synthetic */ class xid implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ xid(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<kke> cls = kke.class;
        Class<Context> cls2 = Context.class;
        switch (this.a) {
            case 0:
                int i = SetupPinCodeScreen.o;
                return new ajd();
            case 1:
                bc7[] bc7Arr = ShareDataPickerScreen.D0;
                return new cc8((wc7) null, 15);
            case 2:
                bc7[] bc7Arr2 = ShareDataPickerScreen.D0;
                return wuc.CHAT_FORWARD;
            case 3:
                return y53.M("", "Нажмите еще раз чтобы увидеть анекдот", "\"Едет отец с сыном на девятке. Перевернулись. Дальше едут на шестерке.\"", "Анекдотов больше нет :c");
            case 4:
                return nd7.g;
            case 5:
                return new ConcurrentHashMap();
            case 6:
                return new AccelerateDecelerateInterpolator();
            case 7:
                bc7[] bc7Arr3 = StartConversationScreen.I0;
                return wuc.CREATE_CHAT;
            case 8:
                bc7[] bc7Arr4 = StartConversationScreen.I0;
                return nyd.a.b();
            case 9:
                bc7[] bc7Arr5 = StartConversationScreen.I0;
                return new cn3(new khe(new xid(8)));
            case 10:
                bc7[] bc7Arr6 = StartConversationScreen.I0;
                nyd nyd = nyd.a;
                return new jzd(nyd.getAccessor().d(cls), nyd.getAccessor().d(cls2), nyd.getAccessor().d(b0d.class), (qn3) nyd.getAccessor().c(qn3.class), nyd.getAccessor().d(yx7.class), nyd.getAccessor().d(iy2.class), nyd.getAccessor().d(ds3.class), nyd.getAccessor().d(oc6.class), nyd.b());
            case 11:
                bc7[] bc7Arr7 = StartConversationScreen.I0;
                return new bh0(dh0.a.getAccessor().d(os3.class), true, (po3) null, 46);
            case Protos.Attaches.Attach.PRESENT:
                return spa.f;
            case 13:
                return new gqd(false);
            case Protos.Attaches.Attach.LOCATION:
                return new gqd(true);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                bc7[] bc7Arr8 = StickersSettingsScreen.Y;
                return wuc.SETTINGS_STICKERS;
            case 16:
                bc7[] bc7Arr9 = StickersSettingsScreen.Y;
                k6e k6e = k6e.a;
                khe d = k6e.getAccessor().d(o2e.class);
                k6e.getAccessor().d(x9c.class);
                return new w6e((Context) k6e.getAccessor().c(cls2), (kke) k6e.getAccessor().c(cls), d, k6e.getAccessor().d(md5.class), k6e.getAccessor().d(sc5.class));
            case LangUtils.HASH_SEED:
                return new ob6(17);
            case 18:
                ky7 ky7 = new ky7();
                w8c w8c = new w8c(11);
                nsd nsd = new nsd();
                w8c.invoke(nsd);
                ky7.put(DiskReadViolation.class, new j9e(nsd.a));
                w8c w8c2 = new w8c(12);
                nsd nsd2 = new nsd();
                w8c2.invoke(nsd2);
                ky7.put(UntaggedSocketViolation.class, new j9e(nsd2.a));
                ArrayList arrayList = new ArrayList();
                arrayList.add(Collections.singletonList("com.google.android.gms"));
                ky7.put(CustomViolation.class, new j9e(arrayList));
                return ky7.b();
            case 19:
                wbe[] values = wbe.values();
                String[] strArr = {"updated", "removed", "cleared", "opened", "authorized"};
                Annotation[][] annotationArr = {null, null, null, null, null};
                t25 t25 = new t25(values.length);
                int length = values.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    wbe wbe = values[i2];
                    int i4 = i3 + 1;
                    String str = (String) ys.f0(i3, strArr);
                    if (str == null) {
                        str = wbe.name();
                    }
                    t25.k(str, false);
                    Annotation[] annotationArr2 = (Annotation[]) ys.f0(i3, annotationArr);
                    if (annotationArr2 != null) {
                        for (Annotation annotation : annotationArr2) {
                            int i5 = t25.d;
                            List[] listArr = t25.f;
                            List list = listArr[i5];
                            if (list == null) {
                                list = new ArrayList(1);
                                listArr[t25.d] = list;
                            }
                            list.add(annotation);
                        }
                    }
                    i2++;
                    i3 = i4;
                }
                return new w25(values, t25);
            case 20:
                return VelocityTracker.obtain();
            case 21:
                int i6 = uge.s0;
                return e5f.a;
            case 22:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 20.0f);
                gradientDrawable.setSize(tu0.G(((float) 51) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 31) * fk4.d().getDisplayMetrics().density));
                return gradientDrawable;
            case 23:
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(fk4.d().getDisplayMetrics().density * 20.0f);
                gradientDrawable2.setSize(tu0.G(((float) 51) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 31) * fk4.d().getDisplayMetrics().density));
                return gradientDrawable2;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setCornerRadius(fk4.d().getDisplayMetrics().density * 20.0f);
                gradientDrawable3.setSize(tu0.G(((float) 51) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 31) * fk4.d().getDisplayMetrics().density));
                return gradientDrawable3;
            case 25:
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setCornerRadius(fk4.d().getDisplayMetrics().density * 20.0f);
                gradientDrawable4.setSize(tu0.G(((float) 51) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 31) * fk4.d().getDisplayMetrics().density));
                return gradientDrawable4;
            case 26:
                GradientDrawable gradientDrawable5 = new GradientDrawable();
                gradientDrawable5.setShape(1);
                float f = (float) 20;
                gradientDrawable5.setSize(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                return gradientDrawable5;
            case 27:
                GradientDrawable gradientDrawable6 = new GradientDrawable();
                gradientDrawable6.setShape(1);
                float f2 = (float) 24;
                gradientDrawable6.setSize(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                return gradientDrawable6;
            case 28:
                return new oe5();
            default:
                sme[] smeArr = {z34.e0, ee4.e0, hq9.e0, tf6.e0, cl8.e0};
                HashSet hashSet = new HashSet(mz7.Z(5));
                ys.k0(smeArr, hashSet);
                return hashSet;
        }
    }
}
