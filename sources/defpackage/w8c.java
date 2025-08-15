package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import one.me.android.OneMeApplication;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.stickersshowcase.StickersShowcaseScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.settings.ActSettings;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: w8c  reason: default package */
public final /* synthetic */ class w8c implements m56 {
    public final /* synthetic */ int a;

    public /* synthetic */ w8c(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        boolean z = false;
        switch (this.a) {
            case 0:
                fka fka = (fka) obj;
                fka.getIcon();
                return new dcf(-1, fka.getIcon().k);
            case 1:
                return ote.s(((TamErrorException) obj).a);
            case 2:
                ((u82) obj).h = null;
                return e5f;
            case 3:
                return Integer.valueOf(((fka) obj).getText().g);
            case 4:
                return Integer.valueOf(((fka) obj).b().g);
            case 5:
                View view = new View((Context) obj);
                view.setId(mda.J);
                view.setWillNotDraw(false);
                return view;
            case 6:
                return new dcf(0, ((fka) obj).a().d(true).d.d);
            case 7:
                Context context = (Context) obj;
                int i = xxb.setting_media_caching;
                int i2 = ActSettings.V0;
                Intent intent = new Intent(context, ActSettings.class);
                intent.putExtra("ru.ok.tamtam.extra.SETTING_ID", i);
                intent.putExtra("ru.ok.tamtam.extra.SHOW_PUSH_ALERT", false);
                context.startActivity(intent);
                return e5f;
            case 8:
                return Boolean.valueOf(((uj3) obj).w());
            case 9:
                View view2 = (View) obj;
                bc7[] bc7Arr = StickersShowcaseScreen.v0;
                y6e.c.P1().b(":stickers/settings", (Bundle) null);
                return e5f;
            case 10:
                d2e d2e = (d2e) obj;
                bc7[] bc7Arr2 = b8e.B0;
                return Boolean.TRUE;
            case 11:
                nsd nsd = (nsd) obj;
                h23 a2 = nec.a(ne7.class);
                nsd.getClass();
                String canonicalName = a2.a().getCanonicalName();
                ArrayList arrayList = nsd.a;
                if (canonicalName != null) {
                    arrayList.add(Collections.singletonList(canonicalName));
                }
                arrayList.add(Collections.singletonList("leakcanary.internal.LeakCanaryFileProvider"));
                nsd.a(nec.a(br7.class), nec.a(z7.class));
                nsd.a(nec.a(OneMeApplication.class), nec.a(Typeface.class));
                return e5f;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                nsd nsd2 = (nsd) obj;
                h23 a3 = nec.a(jo7.class);
                nsd2.getClass();
                String canonicalName2 = a3.a().getCanonicalName();
                if (canonicalName2 != null) {
                    nsd2.a.add(Collections.singletonList(canonicalName2));
                }
                return e5f;
            case 13:
                CharSequence charSequence = ((ybe) obj).e;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return ((kzc) obj).X;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return ((op3) obj).a();
            case 16:
                CharSequence charSequence2 = ((ybe) obj).e;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case LangUtils.HASH_SEED /*17*/:
                return Integer.valueOf(((fka) obj).getText().j);
            case 18:
                tne tne = (tne) obj;
                return "t=" + tne.a + ", c=" + tne.b;
            case 19:
                return Integer.valueOf(((fka) obj).getText().d);
            case 20:
                Thread.State state = (Thread.State) obj;
                return new ei4(ei4.b.incrementAndGet());
            case 21:
                return Long.valueOf(((fs8) obj).a);
            case 22:
                return Long.valueOf(((cu8) obj).k());
            case 23:
                return Long.valueOf(((cu8) obj).b);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return ((cu8) obj).v0;
            case 25:
                return ((dk2) obj).a.toString();
            case 26:
                amf amf = new amf((Context) obj);
                amf.setVisibility(8);
                amf.setAlpha(0.0f);
                return amf;
            case 27:
                return String.valueOf(((qlf) obj).b);
            case 28:
                fka fka2 = (fka) obj;
                bc7[] bc7Arr3 = WebAppRootScreen.G0;
                fka2.getIcon();
                return new dcf(-1, fka2.getIcon().k);
            default:
                return zr6.i("worker_class_name LIKE '", (String) obj, "%'");
        }
    }
}
