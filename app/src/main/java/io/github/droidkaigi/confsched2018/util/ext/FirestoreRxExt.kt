package io.github.droidkaigi.confsched2018.util.ext

import android.support.annotation.CheckResult
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.Query
import io.github.droidkaigi.confsched2018.util.RxFirestore

@CheckResult
fun DocumentReference.observesSnapshot() = RxFirestore.observeDocumentSnapshot(this)

@CheckResult
fun DocumentReference.getsSnapshot() = RxFirestore.getDocumentSnapshot(this)

@CheckResult
fun DocumentReference.sets(value: Any) = RxFirestore.setDocument(this, value)

@CheckResult
fun DocumentReference.deletes() = RxFirestore.deleteDocument(this)

@CheckResult
fun CollectionReference.adds(value: Any) = RxFirestore.addDocumentToCollection(this, value)

@CheckResult
fun Query.observesSnapshot() = RxFirestore.observeQuerySnapshot(this)

@CheckResult
fun Query.getsSnapshot() = RxFirestore.getQuerySnapshot(this)

@CheckResult
fun Query.isEmpty() = RxFirestore.isQuerySnapshotEmpty(this)
