package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;

/* renamed from: mjb  reason: default package */
public final /* synthetic */ class mjb implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileMemberPermissionsScreen b;

    public /* synthetic */ mjb(ProfileMemberPermissionsScreen profileMemberPermissionsScreen, int i) {
        this.a = i;
        this.b = profileMemberPermissionsScreen;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        ProfileMemberPermissionsScreen profileMemberPermissionsScreen = this.b;
        switch (this.a) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) obj;
                int i = ProfileMemberPermissionsScreen.o;
                cla cla = new cla(linearLayout.getContext(), 6);
                cla.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                cla.setTitle(vea.H1);
                cla.setForm(uka.a);
                cla.setTextShimmerEnabled(false);
                cla.setLeftActions(new kka(new mjb(profileMemberPermissionsScreen, 1)));
                linearLayout.addView(cla);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
                recyclerView.setLayoutParams(new ti3(-1, -1));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
                recyclerView.setAdapter(profileMemberPermissionsScreen.c);
                recyclerView.setItemAnimator((mdc) null);
                bi9 bi9 = k37.a;
                bi9 bi92 = new bi9(1);
                bi92.g(2048);
                recyclerView.j(new q1d(qp4.u0.j(recyclerView), new y98((Object) profileMemberPermissionsScreen, 24, (Object) bi92), (l) null, 12));
                float f = (float) 6;
                int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
                int i2 = e37.a;
                yh9 yh9 = new yh9();
                yh9.e(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 0);
                yh9.e(2048, G);
                int G2 = tu0.G(f * fk4.d().getDisplayMetrics().density);
                yh9 yh92 = new yh9();
                yh92.e(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 0);
                yh92.e(2048, G2);
                int G3 = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                int G4 = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
                yh9 yh93 = new yh9();
                yh93.e(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, G3);
                yh93.e(2048, G4);
                recyclerView.j(new nz7(yh93, yh9, yh92, 0));
                linearLayout.addView(recyclerView);
                return e5f;
            default:
                View view = (View) obj;
                int i3 = ProfileMemberPermissionsScreen.o;
                zjb m0 = profileMemberPermissionsScreen.m0();
                m0.getClass();
                pnf.o(m0.x0, g43.b);
                return e5f;
        }
    }
}
