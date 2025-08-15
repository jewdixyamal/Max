package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: nc5  reason: default package */
public final /* synthetic */ class nc5 implements qj3, b66, fu3, b7b {
    public final /* synthetic */ int a;

    public /* synthetic */ nc5(int i) {
        this.a = i;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                hm9.p("sc5", "load: failed", (Throwable) obj);
                return;
            case 1:
                hm9.p("sc5", "onAssetsUpdate: failed to store fav sticker sets", (Throwable) obj);
                return;
            case 2:
                hm9.p("sc5", "setFavoriteStickerSetMoved: failed", (Throwable) obj);
                return;
            case 5:
                hm9.p("sc5", "clear: failed to clear fav stickers repository", (Throwable) obj);
                return;
            case 19:
                hm9.p("md5", "failed favorites obs", (Throwable) obj);
                return;
            case 20:
                hm9.m("md5", "on next favorite sticker ids to subject: %s", (List) obj);
                return;
            case 21:
                hm9.p("md5", "load stickers: failed", (Throwable) obj);
                return;
            case 22:
                hm9.p("md5", "clear: failed to clear repository", (Throwable) obj);
                return;
            default:
                hm9.p("jg5", "onEvent: UpdateMessageEvent: message deleted", (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        wa3 wa3 = wa3.a;
        switch (this.a) {
            case 3:
                return new uqd(((wc5) obj).a(), new nc5(9), 0);
            case 4:
                return new qa3(((wc5) obj).a(), 2, new nc5(7));
            case 6:
                return ((xc5) obj).a;
            case 7:
                fd5 fd5 = (fd5) obj;
                fd5.getClass();
                return new sa3(2, new ia4(2, fd5));
            case 8:
                return ((OneMeRoomDatabase) obj).A();
            case 9:
                fd5 fd52 = (fd5) obj;
                Objects.requireNonNull(fd52);
                return new q1a(2, new uc5(fd52, 0));
            case 10:
                fd5 fd53 = (fd5) obj;
                Objects.requireNonNull(fd53);
                return new q1a(2, new uc5(fd53, 1));
            case 11:
                fd5 fd54 = (fd5) obj;
                fd54.getClass();
                uh uhVar = new uh(fd54, 6, xlc.a(0, "SELECT id FROM favorite_sticker_sets ORDER BY `index` ASC"));
                return ngg.o((OneMeRoomDatabase) fd54.a, new String[]{"favorite_sticker_sets"}, uhVar);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                gu guVar = (gu) obj;
                return new xc5(guVar.Y, guVar.o);
            case 13:
                cu cuVar = (cu) obj;
                return wa3;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                mu muVar = (mu) obj;
                return wa3;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                pu puVar = (pu) obj;
                return wa3;
            case 16:
                gu guVar2 = (gu) obj;
                return new gd5(guVar2.Y, guVar2.c);
            case LangUtils.HASH_SEED /*17*/:
                pu puVar2 = (pu) obj;
                return wa3;
            case 18:
                cu cuVar2 = (cu) obj;
                return wa3;
            case 23:
                return new ArrayList((List) obj);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return ((gd5) obj).a;
            default:
                return ((es8) obj).a.z0.k(g20.u0);
        }
    }

    public boolean test(Object obj) {
        return ((gua) obj).a == 167;
    }

    public Object u(Task task) {
        switch (this.a) {
            case 25:
                return Integer.valueOf(HttpStatus.SC_FORBIDDEN);
            default:
                return -1;
        }
    }
}
