/******************************************************************************
 * JBoss, a division of Red Hat                                               *
 * Copyright 2006, Red Hat Middleware, LLC, and individual                    *
 * contributors as indicated by the @authors tag. See the                     *
 * copyright.txt in the distribution for a full listing of                    *
 * individual contributors.                                                   *
 *                                                                            *
 * This is free software; you can redistribute it and/or modify it            *
 * under the terms of the GNU Lesser General Public License as                *
 * published by the Free Software Foundation; either version 2.1 of           *
 * the License, or (at your option) any later version.                        *
 *                                                                            *
 * This software is distributed in the hope that it will be useful,           *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of             *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU           *
 * Lesser General Public License for more details.                            *
 *                                                                            *
 * You should have received a copy of the GNU Lesser General Public           *
 * License along with this software; if not, write to the Free                *
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA         *
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.                   *
 ******************************************************************************/
package org.gatein.pc.portlet.support.info;

import org.gatein.pc.api.info.ParameterInfo;
import org.gatein.common.i18n.LocalizedString;

import javax.xml.namespace.QName;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

/**
 * @author <a href="mailto:julien@jboss.org">Julien Viet</a>
 * @version $Revision: 630 $
 */
public class ParameterInfoSupport implements ParameterInfo
{

   /** . */
   private final String id;

   /** . */
   private final QName name;

   /** . */
   private LocalizedString description;

   /** . */
   private List<QName> aliases;

   public ParameterInfoSupport(String id, QName name)
   {
      this.id = id;
      this.name = name;
      this.aliases = new ArrayList<QName>();
      this.description = new LocalizedString("Description of event " + name);
   }

   public String getId()
   {
      return id;
   }

   public QName getName()
   {
      return name;
   }

   public LocalizedString getDescription()
   {
      return description;
   }

   public Collection<QName> getAliases()
   {
      return aliases;
   }

   public void setDescription(LocalizedString description)
   {
      this.description = description;
   }

   public void addAlias(QName alias)
   {
      aliases.add(alias);
   }
}