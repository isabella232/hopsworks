/*
 * This file is part of Hopsworks
 * Copyright (C) 2018, Logical Clocks AB. All rights reserved
 *
 * Hopsworks is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * Hopsworks is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.  See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */
package io.hops.hopsworks.api.jwt;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JWTResponseDTO {

  private String token;
  private Date expiresAt;
  private Date nbf;
  private int expLeeway;

  public JWTResponseDTO() {
  }

  public JWTResponseDTO(String token, Date expiresAt, Date nbf, int expLeeway) {
    this.token = token;
    this.expiresAt = expiresAt;
    this.nbf = nbf;
    this.expLeeway = expLeeway;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Date getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Date expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Date getNbf() {
    return nbf;
  }

  public void setNbf(Date nbf) {
    this.nbf = nbf;
  }

  public int getExpLeeway() {
    return expLeeway;
  }

  public void setExpLeeway(int expLeeway) {
    this.expLeeway = expLeeway;
  }

  @Override
  public String toString() {
    return "JWTResponseDTO{" + "token=" + token + ", expiresAt=" + expiresAt + ", nbf=" + nbf + ", expLeeway=" +
        expLeeway + '}';
  }
  
}
