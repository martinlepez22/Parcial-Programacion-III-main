package com.resenas.config;

import org.hibernate.envers.RevisionListener;

import com.resenas.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity) { final Revision revision = (Revision) revisionEntity;}
}
