package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import java.util.ArrayList;
import java.util.Locale;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

public class FrgDlgAudioTracksPicker extends FrgDlgChecked<FrgAttachVideo> {
    public ArrayList F1;

    public final Dialog h1() {
        s08 s08 = new s08(U0());
        s08.e(h0(jpc.g));
        this.F1 = T0().getParcelableArrayList("ru.ok.tamtam.extra.AUDIO_TRACKS");
        lze lze = (lze) T0().getParcelable("ru.ok.tamtam.extra.CURRENT_AUDIO_TRACK");
        Locale v = ((y8a) vl.b()).n().a.v();
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (int i2 = 0; i2 < this.F1.size(); i2++) {
            lze lze2 = (lze) this.F1.get(i2);
            String str = lze2.b;
            String str2 = lze2.c;
            String str3 = null;
            if (!oag.t(str2) && !"und".equals(str2)) {
                str3 = are.e(new Locale(str2).getDisplayLanguage(v));
            }
            if (oag.t(str)) {
                str = str3;
            } else if (!oag.t(str3)) {
                str = str + "(" + str3 + ")";
            }
            boolean t = oag.t(str);
            int i3 = lze2.s0;
            if (t) {
                str = g0().getString(jpc.f, new Object[]{Integer.valueOf(i3 + 1)});
            }
            arrayList.add(str);
            if (i3 == lze.s0 && lze2.t0 == lze.t0) {
                i = i2;
            }
        }
        d10 d10 = new d10(1, this);
        oc ocVar = s08.a;
        ocVar.p = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        ocVar.r = d10;
        ocVar.u = i;
        ocVar.t = true;
        String h0 = h0(jpc.r);
        e10 e10 = new e10(2);
        ocVar.k = h0;
        ocVar.l = e10;
        return s08.a();
    }

    public final Class n1() {
        return FrgAttachVideo.class;
    }
}
