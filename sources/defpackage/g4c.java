package defpackage;

import android.view.View;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* renamed from: g4c  reason: default package */
public final /* synthetic */ class g4c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RaiseHandActionBottomSheet b;

    public /* synthetic */ g4c(RaiseHandActionBottomSheet raiseHandActionBottomSheet, int i) {
        this.a = i;
        this.b = raiseHandActionBottomSheet;
    }

    public final void onClick(View view) {
        RaiseHandActionBottomSheet raiseHandActionBottomSheet = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = RaiseHandActionBottomSheet.B0;
                raiseHandActionBottomSheet.s0(true);
                return;
            default:
                bc7[] bc7Arr2 = RaiseHandActionBottomSheet.B0;
                i4c i4c = (i4c) raiseHandActionBottomSheet.y0.getValue();
                ir1 ir1 = i4c.c;
                gg1 id = ir1.d().a.getId();
                gg1 gg1 = i4c.b;
                boolean f = tpa.f(gg1, id);
                ez0 ez0 = ir1.l;
                if (f) {
                    yz0 yz0 = (yz0) ez0;
                    ParticipantStatesManager f2 = yz0.f();
                    if (f2 != null) {
                        f2.setOwnHandRaised(false);
                    }
                    yz0.x0.set(false);
                } else {
                    yz0 yz02 = (yz0) ez0;
                    ParticipantStatesManager f3 = yz02.f();
                    if (f3 != null) {
                        f3.lowerHandParticipant(mqa.d(gg1));
                    }
                    yz02.C0.g(gb.a);
                }
                raiseHandActionBottomSheet.s0(true);
                return;
        }
    }
}
