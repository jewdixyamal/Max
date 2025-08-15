package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import java.util.ArrayList;

/* renamed from: bt3  reason: default package */
public final class bt3 {
    public final at3 a;

    public bt3(at3 at3) {
        this.a = at3;
    }

    public static ClipData a(ClipDescription clipDescription, ArrayList arrayList) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) arrayList.get(0));
        for (int i = 1; i < arrayList.size(); i++) {
            clipData.addItem((ClipData.Item) arrayList.get(i));
        }
        return clipData;
    }

    public final String toString() {
        return this.a.toString();
    }
}
