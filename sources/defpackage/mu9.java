package defpackage;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;

/* renamed from: mu9  reason: default package */
public abstract class mu9 {
    public static Parcelable a(Person person) {
        return person;
    }

    public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j, person);
    }
}
