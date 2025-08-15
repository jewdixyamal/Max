package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/dialogs/VideoCompressionModeDialog;", "Lru/ok/messages/views/dialogs/FrgDlgBase;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class VideoCompressionModeDialog extends FrgDlgBase {
    public final Dialog h1() {
        v25 v25 = xdf.Y;
        v25.getClass();
        xdf[] xdfArr = (xdf[]) f46.e0(v25, new xdf[0]);
        ArrayList arrayList = new ArrayList(xdfArr.length);
        for (xdf xdf : xdfArr) {
            arrayList.add(xdf.a.a);
        }
        s08 e = new s08(U0()).e(h0(jpc.k1));
        p46 p46 = new p46(this, xdfArr, 4);
        oc ocVar = e.a;
        ocVar.p = (CharSequence[]) arrayList.toArray(new String[0]);
        ocVar.r = p46;
        return e.a();
    }
}
