package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.SliderLayoutManager;

/* renamed from: s34  reason: default package */
public final /* synthetic */ class s34 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DateTimePicker b;
    public final /* synthetic */ int c;

    public /* synthetic */ s34(DateTimePicker dateTimePicker, int i, int i2) {
        this.a = i2;
        this.b = dateTimePicker;
        this.c = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                DateTimePicker dateTimePicker = this.b;
                RecyclerView recyclerView = dateTimePicker.G0;
                ((SliderLayoutManager) recyclerView.getLayoutManager()).n1(this.c, dateTimePicker.Q0);
                recyclerView.post(new t34(dateTimePicker, 0));
                return;
            case 1:
                DateTimePicker dateTimePicker2 = this.b;
                RecyclerView recyclerView2 = dateTimePicker2.I0;
                ((SliderLayoutManager) recyclerView2.getLayoutManager()).n1(this.c, dateTimePicker2.Q0);
                recyclerView2.post(new t34(dateTimePicker2, 2));
                return;
            default:
                DateTimePicker dateTimePicker3 = this.b;
                RecyclerView recyclerView3 = dateTimePicker3.H0;
                ((SliderLayoutManager) recyclerView3.getLayoutManager()).n1(this.c, dateTimePicker3.Q0);
                recyclerView3.post(new t34(dateTimePicker3, 1));
                return;
        }
    }
}
