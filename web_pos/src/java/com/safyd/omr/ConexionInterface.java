/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safyd.omr;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Carlos
 */
public interface ConexionInterface 
{
    public Connection getConnection();
}
