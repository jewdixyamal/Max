package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

/* renamed from: r3d  reason: default package */
public final /* synthetic */ class r3d implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectAlbumWidget b;

    public /* synthetic */ r3d(SelectAlbumWidget selectAlbumWidget, int i) {
        this.a = i;
        this.b = selectAlbumWidget;
    }

    public final Object invoke() {
        SelectAlbumWidget selectAlbumWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = SelectAlbumWidget.Y;
                f4d f4d = new f4d(new bqc(3, selectAlbumWidget), ((iba) selectAlbumWidget.b.getValue()).a());
                od2.L(new zn5(tu0.g(selectAlbumWidget.o0().s0, selectAlbumWidget.getViewLifecycleOwner().Q(), fg7.o), new s3d((Continuation) null, f4d), 5), selectAlbumWidget.getViewLifecycleScope());
                return f4d;
            case 1:
                bc7[] bc7Arr2 = SelectAlbumWidget.Y;
                RecyclerView recyclerView = new RecyclerView(selectAlbumWidget.getContext(), (AttributeSet) null);
                recyclerView.setId(fga.d);
                recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                bc7 bc7 = SelectAlbumWidget.Y[1];
                recyclerView.setAdapter((f4d) selectAlbumWidget.c.getValue());
                recyclerView.setOutlineProvider(new xq0(0, fk4.d().getDisplayMetrics().density * 20.0f));
                v3c.y(new r1b(3, (Continuation) null, 12), recyclerView);
                return recyclerView;
            default:
                bc7[] bc7Arr3 = SelectAlbumWidget.Y;
                f6b f6b = new f6b(selectAlbumWidget.getContext());
                f6b.setStackFromBottom(false);
                f6b.setCallback(new t9(selectAlbumWidget, 4));
                f6b.addView(selectAlbumWidget.m0());
                v3c.y(new br(3, (Continuation) null, 14), f6b);
                return f6b;
        }
    }
}
