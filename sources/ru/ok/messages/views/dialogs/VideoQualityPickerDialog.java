package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/dialogs/VideoQualityPickerDialog;", "Lru/ok/messages/views/dialogs/FrgDlgBase;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class VideoQualityPickerDialog extends FrgDlgBase {
    public static final VideoQualityPickerDialog n1(ArrayList arrayList, mqb mqb, boolean z) {
        VideoQualityPickerDialog videoQualityPickerDialog = new VideoQualityPickerDialog();
        c63.U(arrayList, nqb.g);
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new qqb((nqb) it.next()));
        }
        videoQualityPickerDialog.X0(dy7.g(new kpa("ru.ok.tamtam.extra.QUALITIES", arrayList2), new kpa("ru.ok.tamtam.extra.CURRENT_QUALITY", mqb), new kpa("ru.ok.tamtam.extra.SHOW_SIZE", Boolean.valueOf(z))));
        return videoQualityPickerDialog;
    }

    public final Dialog h1() {
        int i;
        boolean z = true;
        ArrayList<qqb> parcelableArrayList = T0().getParcelableArrayList("ru.ok.tamtam.extra.QUALITIES");
        boolean z2 = T0().getBoolean("ru.ok.tamtam.extra.SHOW_SIZE");
        mqb mqb = (mqb) T0().getSerializable("ru.ok.tamtam.extra.CURRENT_QUALITY");
        if (mqb != null) {
            Iterator it = parcelableArrayList.iterator();
            i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((qqb) it.next()).a.a == mqb) {
                    break;
                } else {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        Context U0 = U0();
        khe khe = sme.a0;
        sme R = fm9.R(U0);
        ArrayList arrayList = new ArrayList(z53.S(parcelableArrayList, 10));
        for (qqb qqb : parcelableArrayList) {
            nqb nqb = qqb.a;
            boolean z3 = nqb.f;
            SpannableStringBuilder append = new SpannableStringBuilder().append(nqb.a.a);
            if (z2) {
                String w = are.w(nqb.e, z, (Context) null);
                append.append(' ').append(z3 ? wg0.i("– ", w) : wg0.i("~ ", w), new ForegroundColorSpan(R.M), 34);
            }
            if (z3) {
                append.append(' ').append(wg0.i("– ", h0(jpc.O1)), new ForegroundColorSpan(R.M), 17);
            }
            arrayList.add(append);
            z = true;
        }
        s08 e = new s08(U0()).e(h0(jpc.v3));
        p46 p46 = new p46(this, parcelableArrayList, 5);
        oc ocVar = e.a;
        ocVar.p = (CharSequence[]) arrayList.toArray(new SpannableStringBuilder[0]);
        ocVar.r = p46;
        ocVar.u = i;
        ocVar.t = true;
        String h0 = h0(jpc.r);
        d10 d10 = new d10(4, this);
        oc ocVar2 = e.a;
        ocVar2.k = h0;
        ocVar2.l = d10;
        return e.a();
    }

    public final void o1(okf okf) {
        hm9.m("ru.ok.messages.views.dialogs.VideoQualityPickerDialog", "set fragment result " + okf, new Object[0]);
        f0().e0("VideoQualityPickerDialog:result:request", dy7.g(new kpa("VideoQualityPickerDialog:result:key", okf)));
        f1(false, false);
    }
}
