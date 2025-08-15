package defpackage;

import android.content.DialogInterface;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import ru.ok.messages.settings.caching.FrgCachingSettings;
import ru.ok.messages.views.dialogs.FrgDlgStopLiveLocation;
import ru.ok.messages.views.dialogs.VideoCompressionModeDialog;
import ru.ok.messages.views.dialogs.VideoQualityPickerDialog;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: p46  reason: default package */
public final /* synthetic */ class p46 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p46(a aVar, Object obj, int i) {
        this.a = i;
        this.b = aVar;
        this.c = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                FrgCachingSettings frgCachingSettings = (FrgCachingSettings) this.b;
                frgCachingSettings.getClass();
                int progress = ((ood) this.c).getProgress();
                jp jpVar = frgCachingSettings.E1;
                if (progress == 0) {
                    jpVar.l("app.media.caching.limit", 536870912L);
                } else if (progress == 1) {
                    jpVar.l("app.media.caching.limit", 1073741824L);
                } else if (progress == 2) {
                    jpVar.l("app.media.caching.limit", 2147483648L);
                } else if (progress == 3) {
                    jpVar.l("app.media.caching.limit", 4294967296L);
                } else if (progress == 4) {
                    jpVar.l("app.media.caching.limit", -1L);
                }
                frgCachingSettings.v1();
                return;
            case 1:
                FrgCachingSettings frgCachingSettings2 = (FrgCachingSettings) this.b;
                frgCachingSettings2.getClass();
                CharSequence charSequence = ((CharSequence[]) this.c)[i];
                boolean equals = charSequence.equals(frgCachingSettings2.h0(jpc.S0));
                jp jpVar2 = frgCachingSettings2.E1;
                if (equals) {
                    jpVar2.k(0, "app.media.caching.time");
                } else if (charSequence.equals(frgCachingSettings2.h0(jpc.U0))) {
                    jpVar2.k(1, "app.media.caching.time");
                } else if (charSequence.equals(frgCachingSettings2.h0(jpc.T0))) {
                    jpVar2.k(2, "app.media.caching.time");
                } else if (charSequence.equals(frgCachingSettings2.h0(jpc.V0))) {
                    jpVar2.k(3, "app.media.caching.time");
                }
                frgCachingSettings2.v1();
                return;
            case 2:
                FrgCachingSettings frgCachingSettings3 = (FrgCachingSettings) this.b;
                frgCachingSettings3.getClass();
                HashSet hashSet = new HashSet();
                for (iw0 iw0 : (List) this.c) {
                    if (iw0.d) {
                        hashSet.add(iw0.b);
                    }
                }
                cx0 cx0 = frgCachingSettings3.H1;
                synchronized (cx0) {
                    if (cx0.k == null) {
                        hm9.p("cx0", "onClearCacheTypesPicked: invalid state no cacheData", (Throwable) null);
                        ((FrgBase) cx0.h).j1();
                        cx0.h.J();
                        return;
                    }
                    cx0.h.F();
                    r0a n = new q28(new ib3(new sa3(1, new zw0(cx0, hashSet, 0)).f(new zw0(cx0, hashSet, 1)), 0, "cx0"), new yw0(cx0, 1), 3).r(cx0.f).n(cx0.g);
                    sd7 sd7 = new sd7(new yw0(cx0, 2), new yw0(cx0, 3), ft.d);
                    n.a(sd7);
                    cx0.a(sd7);
                    return;
                }
            case 3:
                FrgDlgStopLiveLocation frgDlgStopLiveLocation = (FrgDlgStopLiveLocation) this.b;
                frgDlgStopLiveLocation.getClass();
                long j = ((e52) this.c).a;
                a aVar = frgDlgStopLiveLocation.I0;
                Class cls = x46.class;
                ((x46) (aVar != null ? cls.cast(aVar) : cls.cast(frgDlgStopLiveLocation.b0()))).t(j);
                return;
            case 4:
                aef aef = new aef(((xdf[]) this.c)[i]);
                hm9.m("ru.ok.messages.views.dialogs.VideoCompressionModeDialog", "set fragment result " + aef, new Object[0]);
                ((VideoCompressionModeDialog) this.b).f0().e0("VideoCompressionModeDialog:result:request", dy7.g(new kpa("VideoCompressionModeDialog:result:key", aef)));
                return;
            default:
                ((VideoQualityPickerDialog) this.b).o1(new nkf(((qqb) ((ArrayList) this.c).get(i)).a.a));
                return;
        }
    }
}
