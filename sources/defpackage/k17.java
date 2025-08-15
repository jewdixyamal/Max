package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* renamed from: k17  reason: default package */
public final class k17 extends InputConnectionWrapper {
    public final /* synthetic */ z16 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k17(InputConnection inputConnection, z16 z16) {
        super(inputConnection, false);
        this.a = z16;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, wmc] */
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        ey1 ey1;
        if (inputContentInfo == null) {
            ey1 = null;
        } else {
            ? obj = new Object();
            obj.a = inputContentInfo;
            ey1 = new ey1(18, obj);
        }
        if (this.a.g(ey1, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
