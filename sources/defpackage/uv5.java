package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;

/* renamed from: uv5  reason: default package */
public final class uv5 extends RecyclerView {
    public final jv5 V1;

    /* JADX WARNING: type inference failed for: r4v1, types: [sdc, java.lang.Object] */
    public uv5(Context context, ExecutorService executorService) {
        super(context, (AttributeSet) null);
        jv5 jv5 = new jv5(executorService);
        this.V1 = jv5;
        ? obj = new Object();
        setHasFixedSize(true);
        setLayoutManager(new LinearLayoutManager(0, false));
        l(obj);
        setAdapter(jv5);
        j(new sc1(tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density), 3));
    }

    public final void setListener(sv5 sv5) {
        this.V1.Y = sv5;
    }
}
