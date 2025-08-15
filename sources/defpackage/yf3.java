package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.OneMeApplication;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: yf3  reason: default package */
public final /* synthetic */ class yf3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yf3(ns3 ns3) {
        this.a = 2;
        je7 je7 = iyc.q;
        this.b = ns3;
        this.c = je7;
    }

    public final Object invoke() {
        String str;
        xx6 xx6;
        String[] names;
        pq9 pq9 = qp4.u0;
        e5f e5f = e5f.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                int i = ConfirmRemoveOpponentToCallBottomSheet.B0;
                zi1 zi1 = zi1.a;
                return new cg3((gg1) ((Bundle) obj2).getParcelable("opponent_id"), zi1.b(), new eo1(new md1(21, (ConfirmRemoveOpponentToCallBottomSheet) obj), zi1.b(), zi1.getAccessor().d(kke.class), yi1.c(), yi1.a, yi1.a(), yi1.d()));
            case 1:
                ((m56) obj2).invoke(Long.valueOf(((nn3) obj).a));
                return e5f;
            case 2:
                ArrayList arrayList = new ArrayList(((ns3) obj2).a.k());
                ((oq3) ((je7) obj).getValue()).b(arrayList);
                return arrayList;
            case 3:
                return j1e.a(((w9a) ((kke) ((je7) obj2).getValue())).b().limitedParallelism(2, "emoji_sprite_loader").plus(new qj((gy4) obj)));
            case 4:
                cz4 cz4 = (cz4) obj2;
                return new gy4(cz4.d, cz4.a, (je7) obj);
            case 5:
                Context context = (Context) obj2;
                int i2 = maf.a;
                try {
                    str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException unused) {
                    str = "?";
                }
                String str2 = Build.VERSION.RELEASE;
                StringBuilder sb = new StringBuilder(rh4.e(rh4.e(47, str), str2));
                sb.append("ExoPlayer/");
                sb.append(str);
                sb.append(" (Linux;Android ");
                sb.append(str2);
                sb.append(") ExoPlayerLib/2.17.1");
                return new k94(context, sb.toString(), (h84) ((m65) obj).b.getValue());
            case 6:
                mw0 mw0 = new mw0();
                mw0.a = (gw0) ((je7) obj2).getValue();
                mw0.d = (q24) ((n65) obj).a.getValue();
                mw0.e = 2;
                return mw0;
            case 7:
                ((m56) obj2).invoke(Long.valueOf(((fb5) obj).a));
                return e5f;
            case 8:
                m56 m56 = ((hb5) obj2).G0;
                if (m56 != null) {
                    m56.invoke(Long.valueOf(((fb5) obj).a));
                }
                return e5f;
            case 9:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj;
                ((FrameLayout) obj2).removeCallbacks(fakeInAppReviewBottomSheet.F0);
                if (fakeInAppReviewBottomSheet.G0 && (xx6 = (xx6) tx6.a.getAccessor().e()) != null) {
                    xx6.b(4);
                }
                return e5f;
            case 10:
                ki5 ki5 = (ki5) obj2;
                return new oi5(ki5.c, ki5.b, (mi5) obj);
            case 11:
                ((jx5) obj2).Y.i.remove((hx5) obj);
                return e5f;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                bc7[] bc7Arr = ForwardPickerScreen.I0;
                ForwardPickerScreen forwardPickerScreen = (ForwardPickerScreen) obj2;
                ((iz5) forwardPickerScreen.v0().c).r.z(4);
                br7.d((View) obj, ForwardPickerScreen.J0, (m56) null);
                forwardPickerScreen.y0().setLeftIcon(woc.a1);
                return e5f;
            case 13:
                bc7[] bc7Arr2 = ForwardPickerScreen.I0;
                ForwardPickerScreen forwardPickerScreen2 = (ForwardPickerScreen) obj2;
                ((iz5) forwardPickerScreen2.v0().c).h(((sv8) obj).getText(), (Set) forwardPickerScreen2.v0().Z.a.getValue(), forwardPickerScreen2.B0());
                return e5f;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ja7 ja7 = (ja7) obj;
                r6d r6d = (r6d) obj2;
                boolean z = ja7.a.m && tpa.f(r6d.e(), w6d.f);
                tu0.t(ja7, r6d);
                int f = r6d.f();
                for (int i3 = 0; i3 < f; i3++) {
                    List h = r6d.h(i3);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next : h) {
                        if (next instanceof xa7) {
                            arrayList2.add(next);
                        }
                    }
                    xa7 xa7 = (xa7) (arrayList2.size() == 1 ? arrayList2.get(0) : null);
                    if (!(xa7 == null || (names = xa7.names()) == null)) {
                        for (String str3 : names) {
                            if (z) {
                                str3 = str3.toLowerCase(Locale.ROOT);
                            }
                            tu0.b(linkedHashMap, r6d, str3, i3);
                        }
                    }
                    String lowerCase = z ? r6d.g(i3).toLowerCase(Locale.ROOT) : null;
                    if (lowerCase != null) {
                        tu0.b(linkedHashMap, r6d, lowerCase, i3);
                    }
                }
                return linkedHashMap.isEmpty() ? oz4.a : linkedHashMap;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                bc7[] bc7Arr3 = MediaGalleryWidget.Z;
                qj qjVar = new qj(jyc.a.i());
                je7 b2 = fua.a.b();
                la8 la8 = la8.a;
                hq7 hq7 = (hq7) la8.getAccessor().c(hq7.class);
                je7 je7 = iyc.a;
                Class<d86> cls = d86.class;
                Object v = ay7.v((Bundle) obj2, "arg_gallery_mode", cls);
                if (v != null) {
                    MediaGalleryWidget mediaGalleryWidget = (MediaGalleryWidget) obj;
                    return new z96((d86) ((Parcelable) v), mediaGalleryWidget.getContext(), qjVar, (xp7) la8.getAccessor().c(xp7.class), hq7, b2, la8.getAccessor().d(y7d.class), mediaGalleryWidget.n0());
                }
                throw new IllegalArgumentException(zr6.i("No value passed for key arg_gallery_mode of type ", cls.getSimpleName(), " in bundle").toString());
            case 16:
                uc7 uc7 = (uc7) ((hc8) obj2).d.invoke();
                if (uc7 != null) {
                    uc7.O();
                }
                ((k56) obj).invoke();
                return e5f;
            case LangUtils.HASH_SEED /*17*/:
                ImageView imageView = new ImageView((Context) obj2);
                imageView.setId(xoc.U);
                float f2 = (float) 28;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 80;
                sv8 sv8 = (sv8) obj;
                layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, sv8.a);
                imageView.setLayoutParams(layoutParams);
                imageView.setImageResource(sv8.o);
                imageView.setImageTintList(ColorStateList.valueOf(pq9.j(imageView).a().h().b.b));
                return imageView;
            case 18:
                n59 n59 = (n59) obj;
                return new eg9((je7) obj2, n59.a, n59.Y, n59.q1, new vw(2, n59, n59.class, "onMessageAction", "onMessageAction(Ljava/util/List;I)V", 0, 28));
            case 19:
                s35 s35 = ((n59) obj2).v1;
                u29 u29 = u29.c;
                String str4 = ((aj7) ((ej7) obj)).a;
                u29.getClass();
                wg0.k(":call-join-preview?link=".concat(str4), s35);
                return e5f;
            case 20:
                return new zc0(((wa9) obj2).b, (je7) obj);
            case 21:
                return new ar9((sx3) ((dr9) obj2).a.getValue(), (je7) obj);
            case 22:
                c5a c5a = (c5a) obj2;
                String str5 = ((OneMeApplication) obj).Y;
                try {
                    gze.a(c5a);
                    hm9.m(str5, "Tracer init success!", new Object[0]);
                } catch (Throwable th) {
                    hm9.p(str5 + "/Tracer", "failed when init", th);
                }
                return e5f;
            case 23:
                nfa nfa = new nfa((Context) obj2);
                nfa.setId(xoc.h);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                nfa.setLayoutParams(layoutParams2);
                nfa.setAppearance(afa.a);
                nfa.setSize(ifa.a);
                br7.b((f7a) obj, nfa, -1);
                return nfa;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new h8a((je7) obj2, ((qi8) obj).o);
            case 25:
                EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable((Context) obj2, jub.ic_cancel_filled_24);
                pq9.j((g9a) obj).getIcon();
                c54.Z(enhancedVectorDrawable, "circle_background", -1);
                return enhancedVectorDrawable;
            case 26:
                int i4 = taa.f;
                ((taa) obj2).a().e.remove((raa) obj);
                return e5f;
            case 27:
                StringBuilder o = rh4.o(kk5.g(((kk5) ((uca) obj2).b.b.getValue()).c(), "logs").getAbsolutePath(), File.separator);
                o.append(((qca) obj).a);
                return o.toString();
            case 28:
                xha xha = (xha) ((i50) obj2).Y;
                if (xha != null) {
                    xha.I((yha) obj);
                }
                return e5f;
            default:
                qaa qaa = new qaa((Context) obj2);
                qaa.setId(xoc.A0);
                int s = au1.s(((vja) obj).getTabItem().c);
                paa paa = paa.a;
                if (s != 0) {
                    if (s == 1) {
                        paa = paa.b;
                    } else if (s != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                qaa.setAppearance(paa);
                return qaa;
        }
    }

    public /* synthetic */ yf3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
