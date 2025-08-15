package defpackage;

import android.view.View;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: fbc  reason: default package */
public final /* synthetic */ class fbc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ fbc(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    public final void onClick(View view) {
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = RecordControlsWidget.b1;
                recordControlsWidget.I0().A();
                return;
            case 1:
                bc7[] bc7Arr2 = RecordControlsWidget.b1;
                cbc I0 = recordControlsWidget.I0();
                I0.C();
                I0.v0.m((Object) null, new tac(2, I0.x(), false));
                return;
            case 2:
                bc7[] bc7Arr3 = RecordControlsWidget.b1;
                recordControlsWidget.I0().z();
                return;
            default:
                bc7[] bc7Arr4 = RecordControlsWidget.b1;
                cbc I02 = recordControlsWidget.I0();
                bc7[] bc7Arr5 = cbc.G0;
                I02.B(true);
                return;
        }
    }
}
