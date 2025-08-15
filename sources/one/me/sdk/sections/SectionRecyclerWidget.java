package one.me.sdk.sections;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/sdk/sections/SectionRecyclerWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "sections-widget_release"}, k = 1, mv = {2, 0, 0})
public abstract class SectionRecyclerWidget extends Widget {
    public static final /* synthetic */ bc7[] c;
    public final q7c a = viewBinding(pga.o);
    public final bkg b = new bkg(24, this);

    static {
        hob hob = new hob(SectionRecyclerWidget.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        c = new bc7[]{hob};
    }

    public SectionRecyclerWidget() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    public abstract y51 m0();

    public abstract mfd n0();

    public final RecyclerView o0(int i) {
        nd3 nd3 = new nd3(n0(), m0());
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(pga.o);
        recyclerView.setAdapter(nd3);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        float f = (float) 12;
        recyclerView.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        fka j = qp4.u0.j(recyclerView);
        bkg bkg = this.b;
        recyclerView.j(new q1d(j, bkg, (l) null, 12));
        recyclerView.j(new lm4(bkg, i));
        return recyclerView;
    }
}
